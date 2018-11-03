
package model;

import rscsis.Usuario;
/**
 *
 * @author Rafael
 */
public class LoginManager {
    
    public synchronized String autenticador(String login, String senha){
        Usuario usu = new Usuario();
     //Assim que deveria ser-->if(login.equalsIgnoreCase(usu.getLogin()) && senha.equals(usu.getSenha())) {
        if(login.equalsIgnoreCase(login) && "1234".equals(senha)) {
        return "sucesso";
    }
        
        else{
                return "falha";
                }
    }
    
}
