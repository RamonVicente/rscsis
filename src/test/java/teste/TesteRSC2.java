/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import model.RSC1;
import model.RSC2;
import model.Usuario;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author ramon
 */
public class TesteRSC2 extends TesteBase{
    
    @Test
    public void t01_inserirRSC1(){
        Usuario user = em.find(Usuario.class, 1L);
        
        RSC2 rsc2 = new RSC2();
        rsc2.setOrientacao_cooerientacao_tcc(1);
        rsc2.setOrientacao_tutoria_supervisao_1(1);
        rsc2.setOrientacao_tutoria_supervisao_2(0);
        rsc2.setOrientacao_tutoria_supervisao_3(1);
        rsc2.setOrientacao_tutoria_supervisao_4(0);
        rsc2.setUsuario(user);
        
        em.persist(rsc2);
        em.flush();
        
        assertNotNull(rsc2.getId());
    }
}
