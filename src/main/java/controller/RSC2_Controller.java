/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bd.RSC2_DB;
import bd.UsuarioBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RSC2;
import model.Usuario;

/**
 *
 * @author ramon
 */
public class RSC2_Controller extends HttpServlet {

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
            out.println("<title>Servlet RSC2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RSC2 at " + request.getContextPath() + "</h1>");
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
        
        RSC2 rsc2 = new RSC2();
        RSC2_DB rsc2DB = new RSC2_DB();
        
        UsuarioBD usuarioBD = new UsuarioBD();
        Usuario usuario = usuarioBD.find(Long.parseLong(request.getParameter("id_usuario")));
        
        rsc2.setOrientacao_cooerientacao_tcc(Integer.parseInt(request.getParameter("orientacao_cooerientacao_tcc")));
        rsc2.setOrientacao_tutoria_supervisao_1(Integer.parseInt(request.getParameter("orientacao_tutoria_supervisao_1")));
        rsc2.setOrientacao_tutoria_supervisao_2(Integer.parseInt(request.getParameter("orientacao_tutoria_supervisao_2")));
        rsc2.setOrientacao_tutoria_supervisao_3(Integer.parseInt(request.getParameter("orientacao_tutoria_supervisao_3")));
        rsc2.setOrientacao_tutoria_supervisao_4(Integer.parseInt(request.getParameter("orientacao_tutoria_supervisao_4")));
        rsc2.setUsuario(usuario);
        
        rsc2DB.create(rsc2);
        
        if(usuario != null){
            request.setAttribute("cadastrado","Documento Cadastrado com sucesso!");    
            RequestDispatcher rd = request.getRequestDispatcher("rsc2");
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
