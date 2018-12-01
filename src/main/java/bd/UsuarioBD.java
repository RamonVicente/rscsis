package bd;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import model.Usuario;

/**
 *
 * @author valeria
 */
public class UsuarioBD implements Serializable {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("rscsis");
    EntityManager em = emf.createEntityManager();

    ;
    
    public void create(Usuario usuario) {

        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Usuario find(Long id) {
        return em.find(Usuario.class, id);
    }

    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {

        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Usuario getSiape(String siape) {

        String jpql = "SELECT u FROM Usuario u where u.siape = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, siape);
        try {
            Usuario usuario = (Usuario) query.getSingleResult();

            return usuario;
        } catch (NoResultException e) {
            return null;
        }
    }
}
