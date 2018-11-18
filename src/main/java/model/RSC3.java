/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ramon
 */

import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="TB_RSC3")
@Entity
@Access(AccessType.FIELD)
public class RSC3 implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private int projeto_1;
    private int projeto_2;
    private int elaboracao_documentos_tecnicos;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO", nullable = false)
    private Usuario usuario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getProjeto_1() {
        return projeto_1;
    }

    public void setProjeto_1(int projeto_1) {
        this.projeto_1 = projeto_1;
    }

    public int getProjeto_2() {
        return projeto_2;
    }

    public void setProjeto_2(int projeto_2) {
        this.projeto_2 = projeto_2;
    }

    public int getElaboracao_documentos_tecnicos() {
        return elaboracao_documentos_tecnicos;
    }

    public void setElaboracao_documentos_tecnicos(int elaboracao_documentos_tecnicos) {
        this.elaboracao_documentos_tecnicos = elaboracao_documentos_tecnicos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
