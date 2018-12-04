/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.RSC1;
import model.Usuario;

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
    
    public RSC1 findByUsuarioId(String usuario_id){
        String jpql = "SELECT r FROM RSC1 r where r.ID_USUARIO = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, usuario_id);
        try {
            RSC1 rsc1 = (RSC1) query.getSingleResult();

            return rsc1;
        } catch (NoResultException e) {
            return null;
        }
    }
}
