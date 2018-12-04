/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ramon
 */
@Entity
@Table(name="TB_RSC1_ARQUIVO")
public class UploadFileRSC1 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String gestao_escolar_1;
    @Column(nullable = true)
    private String gestao_escolar_2;
    @Column(nullable = true)
    private String exercicio_magisterio_ou_tutoria;
    @Column(nullable = true)
    private String gestao_publico_privado;
    @Column(nullable = true)
    private String experiencia_atuacao_ou_formacao;
    @Column(nullable = true)
    private String participacao_colegiado_conselhos;
    @Column(nullable = true)
    private String atividade_organizacao_social;
    
    @OneToOne(fetch = FetchType.LAZY)
    private Usuario usuario; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGestao_escolar_1() {
        return gestao_escolar_1;
    }

    public void setGestao_escolar_1(String gestao_escolar_1) {
        this.gestao_escolar_1 = gestao_escolar_1;
    }

    public String getGestao_escolar_2() {
        return gestao_escolar_2;
    }

    public void setGestao_escolar_2(String gestao_escolar_2) {
        this.gestao_escolar_2 = gestao_escolar_2;
    }

    public String getExercicio_magisterio_ou_tutoria() {
        return exercicio_magisterio_ou_tutoria;
    }

    public void setExercicio_magisterio_ou_tutoria(String exercicio_magisterio_ou_tutoria) {
        this.exercicio_magisterio_ou_tutoria = exercicio_magisterio_ou_tutoria;
    }

    public String getGestao_publico_privado() {
        return gestao_publico_privado;
    }

    public void setGestao_publico_privado(String gestao_publico_privado) {
        this.gestao_publico_privado = gestao_publico_privado;
    }

    public String getExperiencia_atuacao_ou_formacao() {
        return experiencia_atuacao_ou_formacao;
    }

    public void setExperiencia_atuacao_ou_formacao(String experiencia_atuacao_ou_formacao) {
        this.experiencia_atuacao_ou_formacao = experiencia_atuacao_ou_formacao;
    }

    public String getParticipacao_colegiado_conselhos() {
        return participacao_colegiado_conselhos;
    }

    public void setParticipacao_colegiado_conselhos(String participacao_colegiado_conselhos) {
        this.participacao_colegiado_conselhos = participacao_colegiado_conselhos;
    }

    public String getAtividade_organizacao_social() {
        return atividade_organizacao_social;
    }

    public void setAtividade_organizacao_social(String atividade_organizacao_social) {
        this.atividade_organizacao_social = atividade_organizacao_social;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UploadFileRSC1)) {
            return false;
        }
        UploadFileRSC1 other = (UploadFileRSC1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.UploadFileRSC1[ id=" + id + " ]";
    }
    
}
