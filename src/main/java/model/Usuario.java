
package model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author valeria
 */
@Table(name="TB_USUARIO")
@Entity
@Access(AccessType.FIELD)
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_USUARIO")
    private Long id;
    @Column(name="CL_NOME")
    private String nome;
    @Column(name="CL_SIAPE")
    private String siape;
    @Column(name="CL_LOGIN")
    private String login;
    @Column(name="CL_SENHA")
    private String senha;
    @Enumerated(EnumType.STRING)
    @Column(name="CL_TIPO_USUARIO")
    private TipoUsuario tipo;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.PERSIST,
        targetEntity = RSC1.class, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<RSC1> rsc1Lista;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.PERSIST,
        targetEntity = RSC2.class, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<RSC2> rsc2Lista;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.PERSIST,
        targetEntity = RSC3.class, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<RSC3> rsc3Lista;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public List<RSC1> getRsc1Lista() {
        return rsc1Lista;
    }

    public void setRsc1Lista(List<RSC1> rsc1Lista) {
        this.rsc1Lista = rsc1Lista;
    }

    public List<RSC2> getRsc2Lista() {
        return rsc2Lista;
    }

    public void setRsc2Lista(List<RSC2> rsc2Lista) {
        this.rsc2Lista = rsc2Lista;
    }

    public List<RSC3> getRsc3Lista() {
        return rsc3Lista;
    }

    public void setRsc3Lista(List<RSC3> rsc3Lista) {
        this.rsc3Lista = rsc3Lista;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
