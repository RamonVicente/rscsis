/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bd.RSC3_DB;
import bd.UsuarioBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RSC3;
import model.Usuario;

/**
 *
 * @author ramon
 */
public class RSC3_Controller extends HttpServlet {

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
            out.println("<title>Servlet RSC3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RSC3 at " + request.getContextPath() + "</h1>");
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
        
        RSC3 rsc3 = new RSC3();
        RSC3_DB rsc3DB = new RSC3_DB();
        
        UsuarioBD usuarioBD = new UsuarioBD();
        Usuario usuario = usuarioBD.find(Long.parseLong(request.getParameter("id_usuario")));
        
        rsc3.setProjeto_1(Integer.parseInt(request.getParameter("projeto_1")));
        rsc3.setProjeto_2(Integer.parseInt(request.getParameter("projeto_2")));
        rsc3.setElaboracao_documentos_tecnicos(Integer.parseInt(request.getParameter("elaboracao_documentos_tecnicos")));
        rsc3.setUsuario(usuario);
        
        rsc3DB.create(rsc3);
        
        if(usuario != null){
            request.setAttribute("cadastrado","Documento Cadastrado com sucesso!");    
            RequestDispatcher rd = request.getRequestDispatcher("rsc3");
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
