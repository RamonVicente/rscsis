
package teste;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.CacheRetrieveMode;
import javax.persistence.Query;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import model.TipoUsuario;
import model.Usuario;

/**
 *
 * @author valeria
 */
public class TesteUsuarioCrud extends TesteBase {
 
    @Test
    public void t01_inserirUsuario(){
        Usuario user = new Usuario();
        user.setNome("Pedro Augusto");
        user.setSiape("rr2901");
        user.setLogin("pedroausgusto");
        user.setSenha("Pedro1234");
        user.setTipo(TipoUsuario.PROFESSOR);
        em.persist(user);
        em.flush();
        assertNotNull(user.getId());
        
        
    }
    @Test
    public void t02_atualizarUsuario(){
        Usuario u;
        String consulta = "SELECT u FROM Usuario u WHERE u.id=?1";
        Query query = em.createQuery(consulta);
        query.setHint("javax.persistence.cache.retrieveMode", CacheRetrieveMode.BYPASS);
        query.setParameter(1, 1);
        u = (Usuario)query.getSingleResult();
        u.setSenha("BolaQuadrada");
        em.flush();
        
        query.setParameter(1,1);
        u=(Usuario)query.getSingleResult();
        
        assertEquals("BolaQuadrada", u.getSenha());
        
    }
    @Test
    public void t3_deletarUsuario(){
        Usuario u;
        String consulta = "SELECT u FROM Usuario u WHERE u.id=?1";
        Query query = em.createQuery(consulta);
        long id =3;
        query.setParameter(1, id);
        u = (Usuario)query.getSingleResult();
        em.remove(u);
        em.flush();
        Map map = new HashMap();
        map.put("javax.persistence.cache.retrieveMode", CacheRetrieveMode.BYPASS);
        Usuario deletado = em.find(Usuario.class, id, map);
        assertNull(deletado);
    }
    
}
