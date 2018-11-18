
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
 * @author Rafael
 */
public class LoginController extends HttpServlet {

    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(false);
            UsuarioBD userBd = new UsuarioBD();
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
           
            LoginManager loginManager = new LoginManager();
            String result = loginManager.autenticador(login, senha);
            //Object usuario = new Date();

            if (result.equals("sucesso")) {
                synchronized (this) {
                    RequestDispatcher view = request.getRequestDispatcher("WEB-INF/view/home.jsp");
                    view.forward(request, response);
                }

            } else {
                synchronized (this) {
                    session.invalidate();
                    RequestDispatcher view = request.getRequestDispatcher("WEB-INF/view/login.jsp");
                    view.forward(request, response);
                }

            }

        }*/
        UsuarioBD u = new UsuarioBD();  
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        HttpSession session = request.getSession();
        session.removeAttribute("falhalogin");
            
        for (Usuario user : u.findUsuarioEntities()) {
                
            if(user.getLogin().equals(login) && user.getSenha().equals(senha)) {
                    
                session.setAttribute("usuario", user);
                    
                if (user.getTipo() != null){
                   
                    switch (user.getTipo()) {
                        case PROFESSOR:
                            {
                                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/cadastro.jsp");
                                rd.forward(request, response);
                                break;
                            }
                        case COMISSAOPERMANENTE:
                            {
                                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/");
                                rd.forward(request, response); 
                                break;
                            }
                        case COMISSAOESPECIAL:
                            {
                                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/");
                                rd.forward(request, response);
                                break;
                            }
                        default:
                            break;
                    }
                   
                 
              
                }
            }
        }
        if (session.getAttribute("usuario") == null) {
                    
                   session.setAttribute("falhalogin", "Falha ao Efetuar Login!");
                   RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/login.jsp");
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
