/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Marcelo
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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
      
    }
    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
          try {
             PrintWriter out = response.getWriter();
             String login = request.getParameter("login");
             String senha = request.getParameter("senha");
          if (login=="marcelo"&&senha=="345"){
           // contato.setNome(request.getParameter("nome"));
           // contato.setLogin(request.getParameter("login"));
           // contato.setSenha(request.getParameter("senha"));
            //chamando o metodo salvar, passando o obj
           // contato2.salvar(contato);
            //RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            //dispatcher.forward( request, response );
            response.sendRedirect(request.getContextPath()+"Hello.hmtl");  
            response.sendRedirect("/Hello.hmtl");   
              
           
         }
        } catch (NumberFormatException e) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
