/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.RSC1;

/**
 *
 * @author ramon
 */
public class RSC1_DB implements Serializable{
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("rscsis");
    EntityManager em = emf.createEntityManager();;
    
    public void create(RSC1 rsc1) {
        
        try {
            em.getTransaction().begin();
            em.persist(rsc1);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public RSC1 findByUsuarioId(Long usuario_id){
        Query sql = em.createNativeQuery("SELECT * FROM TB_RSC1 WHERE ID_USUARIO="+ usuario_id, RSC1.class);
        return (RSC1) sql.getSingleResult();
    }
}
