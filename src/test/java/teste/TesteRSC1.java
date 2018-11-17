/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import model.RSC1;
import model.TipoUsuario;
import model.Usuario;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author ramon
 */
public class TesteRSC1 extends TesteBase{
    
    @Test
    public void t01_inserirRSC1(){
        Usuario user = em.find(Usuario.class, 2L);
        
        RSC1 rsc1 = new RSC1();
        rsc1.setAtividade_organizacao_social(1);
        rsc1.setExercicio_magisterio_ou_tutoria(2);
        rsc1.setExperiencia_atuacao_ou_formacao(4);
        rsc1.setGestao_escolar_1(1);
        rsc1.setGestao_escolar_2(1);
        rsc1.setGestao_publico_privado(0);
        rsc1.setParticipacao_colegiado_conselhos(1);
        rsc1.setUsuario(user);
        
        em.persist(rsc1);
        em.flush();
        
        assertNotNull(rsc1.getId());
    }
    
}
