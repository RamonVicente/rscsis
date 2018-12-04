/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bd.RSC1_DB;
import bd.UsuarioBD;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.RSC1;
import model.UploadFileRSC1;
import model.Usuario;

/**
 *
 * @author ramon
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
  maxFileSize = 1024 * 1024 * 10, 
  maxRequestSize = 1024 * 1024 * 10 * 10)
public class UploadFile extends HttpServlet {
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UploadFile</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UploadFile at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
         // Cria um caminho para salvar o arquivo. Renomeia com o caminho do projeto
        String path = "/home/ramon/Documentos/College/Ageis/rscsis/src/main/resources/docs";
        Part filePart1 = request.getPart("gestao_escolar_1");
        Part filePart2 = request.getPart("gestao_escolar_2");
        Part filePart3 = request.getPart("exercicio_magisterio_ou_tutoria");
        Part filePart4 = request.getPart("gestao_publico_privado");
        Part filePart5 = request.getPart("experiencia_atuacao_ou_formacao");
        Part filePart6 = request.getPart("participacao_colegiado_conselhos");
        Part filePart7 = request.getPart("atividade_organizacao_social");
        
        List <Part> listPart = new ArrayList<>();
        if(filePart1 != null)
            listPart.add(filePart1);
        if(filePart2 != null)
            listPart.add(filePart2);
        if(filePart3 != null)
            listPart.add(filePart3);
        if(filePart4 != null)
            listPart.add(filePart4);
        if(filePart5 != null)
            listPart.add(filePart5);
        if(filePart6 != null)
            listPart.add(filePart6);
        if(filePart7 != null)
            listPart.add(filePart7);
        
        for(Part arquivo : listPart){
                addFiles(arquivo, path, response);
        }
        
        //cadastrar no banco
            RSC1_DB rsc1DB  = new RSC1_DB();
            UploadFileRSC1 rsc1File = new UploadFileRSC1();
            UsuarioBD usuarioBD = new UsuarioBD();
            Usuario usuario = usuarioBD.find(Long.parseLong(request.getParameter("id_usuario")));

            rsc1File.setGestao_escolar_1(getFileName(filePart1));
            rsc1File.setGestao_escolar_2(getFileName(filePart2));
            rsc1File.setExercicio_magisterio_ou_tutoria(getFileName(filePart3));
            rsc1File.setGestao_publico_privado(getFileName(filePart4));
            rsc1File.setExperiencia_atuacao_ou_formacao(getFileName(filePart5));
            rsc1File.setParticipacao_colegiado_conselhos(getFileName(filePart6));
            rsc1File.setAtividade_organizacao_social(getFileName(filePart7));
            rsc1File.setUsuario(usuario);
            
            rsc1DB.createFile(rsc1File);
        
    }

    private String getFileName(Part part) {
        String partHeader = part.getHeader("content-disposition");
        
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
                
    }
    
    private void addFiles(Part file, String path, HttpServletResponse response) throws IOException{
        String fileName = getFileName(file); 

        OutputStream out = null;
        InputStream filecontent = null;
        PrintWriter writer = response.getWriter();

        try {
            out = new FileOutputStream(new File(path + File.separator
                    + fileName));
            filecontent = file.getInputStream();

            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = filecontent.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            
            
            writer.println("New file " + fileName + " created at " + path);// + " "+ rsc1.getGestao_escolar_1());
           

        } catch (FileNotFoundException fne) {
            writer.println("You either did not specify a file to upload or are "
                    + "trying to upload a file to a protected or nonexistent "
                    + "location.");
            writer.println("<br/> ERROR: " + fne.getMessage());

        } finally {
            if (out != null) {
                out.close();
            }
            if (filecontent != null) {
                filecontent.close();
            }
            if (writer != null) {
                writer.close();
            }
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
