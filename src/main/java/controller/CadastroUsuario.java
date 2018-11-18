
package controller;

import bd.UsuarioBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.TipoUsuario;
import model.Usuario;

/**
 *
 * @author valeria
 */

public class CadastroUsuario extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastroUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession();
        session.removeAttribute("cadastrado");
        Usuario usuario = new Usuario();
        UsuarioBD usuarioBD = new UsuarioBD();
        
        String nome = request.getParameter("nome");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String matricula = request.getParameter("matricula");
        String tipoUser = request.getParameter("selecionar");
        
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setSenha(senha);
        usuario.setSiape(matricula);
        if("professor".equals(tipoUser)){
            usuario.setTipo(TipoUsuario.PROFESSOR);
        }else if("permanente".equals(tipoUser)){
            usuario.setTipo(TipoUsuario.COMISSAOPERMANENTE);
        }else if("especial".equals(tipoUser)){
            usuario.setTipo(TipoUsuario.COMISSAOESPECIAL);
        }          
              
        usuarioBD.create(usuario);
        
         if(usuario != null){
        request.setAttribute("cadastrado","Usuário Cadastrado com sucesso!");    
        RequestDispatcher rd = request.getRequestDispatcher("Cadastro");
        rd.forward(request, response);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
