/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import model.RSC2;
import model.RSC3;
import model.Usuario;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author ramon
 */
public class TesteRSC3 extends TesteBase{
    
    /*@Test
    public void t01_inserirRSC3(){
        Usuario user = em.find(Usuario.class, 3L);
        
        RSC3 rsc3 = new RSC3();
        rsc3.setElaboracao_documentos_tecnicos(1);
        rsc3.setProjeto_1(2);
        rsc3.setProjeto_2(1);
        rsc3.setUsuario(user);
        
        em.persist(rsc3);
        em.flush();
        
        assertNotNull(rsc3.getId());
    }*/
}
