/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bd.RSC1_DB;
import model.RSC1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;
import bd.UsuarioBD;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author ramon
 */
public class RSC1_Controller extends HttpServlet {

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
            out.println("<title>Servlet RSC1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RSC1 at " + request.getContextPath() + "</h1>");
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
        
        HttpSession session = request.getSession();
        session.removeAttribute("cadastrado");
        
        RSC1 rsc1 = new RSC1();
        RSC1_DB rsc1DB = new RSC1_DB();
        
        UsuarioBD usuarioBD = new UsuarioBD();
        Usuario usuario = usuarioBD.find(Long.parseLong(request.getParameter("id_usuario")));
        
        rsc1.setGestao_escolar_1(Integer.parseInt(request.getParameter("gestao_escolar_1")));
        rsc1.setGestao_escolar_2(Integer.parseInt(request.getParameter("gestao_escolar_2")));
        rsc1.setExercicio_magisterio_ou_tutoria(Integer.parseInt(request.getParameter("exercicio_magisterio_ou_tutoria")));
        rsc1.setGestao_publico_privado(Integer.parseInt(request.getParameter("gestao_publico_privado")));
        rsc1.setExperiencia_atuacao_ou_formacao(Integer.parseInt(request.getParameter("experiencia_atuacao_ou_formacao")));
        rsc1.setParticipacao_colegiado_conselhos(Integer.parseInt(request.getParameter("participacao_colegiado_conselhos")));
        rsc1.setAtividade_organizacao_social(Integer.parseInt(request.getParameter("atividade_organizacao_social")));
        rsc1.setUsuario(usuario);
        
        rsc1DB.create(rsc1);
        
        if(usuario != null){
            request.setAttribute("cadastrado","Documento Cadastrado com sucesso!");    
            RequestDispatcher rd = request.getRequestDispatcher("rsc1");
            rd.forward(request, response);
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
