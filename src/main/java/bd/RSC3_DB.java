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
import model.RSC3;

/**
 *
 * @author ramon
 */
public class RSC3_DB implements Serializable{
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("rscsis");
    EntityManager em = emf.createEntityManager();;
    
    public void create(RSC3 rsc3) {
        
        try {
            em.getTransaction().begin();
            em.persist(rsc3);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
