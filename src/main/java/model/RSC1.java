/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ramon
 */
@Table(name="TB_RSC1")
@Entity
@Access(AccessType.FIELD)
public class RSC1 implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private int gestao_escolar_1;
    private int gestao_escolar_2;
    private int exercicio_magisterio_ou_tutoria;
    private int gestao_publico_privado;
    private int experiencia_atuacao_ou_formacao;
    private int participacao_colegiado_conselhos;
    private int atividade_organizacao_social;
    
    private String file1;
    private String file2;
    private String file3;
    private String file4;
    private String file5;
    private String file6;
    private String file7;
    
   
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO", nullable = false)
    private Usuario usuario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGestao_escolar_1() {
        return gestao_escolar_1;
    }

    public void setGestao_escolar_1(int gestao_escolar_1) {
        this.gestao_escolar_1 = gestao_escolar_1;
    }

    public int getGestao_escolar_2() {
        return gestao_escolar_2;
    }

    public void setGestao_escolar_2(int gestao_escolar_2) {
        this.gestao_escolar_2 = gestao_escolar_2;
    }

    public int getExercicio_magisterio_ou_tutoria() {
        return exercicio_magisterio_ou_tutoria;
    }

    public void setExercicio_magisterio_ou_tutoria(int exercicio_magisterio_ou_tutoria) {
        this.exercicio_magisterio_ou_tutoria = exercicio_magisterio_ou_tutoria;
    }

    public int getGestao_publico_privado() {
        return gestao_publico_privado;
    }

    public void setGestao_publico_privado(int gestao_publico_privado) {
        this.gestao_publico_privado = gestao_publico_privado;
    }

    public int getExperiencia_atuacao_ou_formacao() {
        return experiencia_atuacao_ou_formacao;
    }

    public void setExperiencia_atuacao_ou_formacao(int experiencia_atuacao_ou_formacao) {
        this.experiencia_atuacao_ou_formacao = experiencia_atuacao_ou_formacao;
    }

    public int getParticipacao_colegiado_conselhos() {
        return participacao_colegiado_conselhos;
    }

    public void setParticipacao_colegiado_conselhos(int participacao_colegiado_conselhos) {
        this.participacao_colegiado_conselhos = participacao_colegiado_conselhos;
    }

    public int getAtividade_organizacao_social() {
        return atividade_organizacao_social;
    }

    public void setAtividade_organizacao_social(int atividade_organizacao_social) {
        this.atividade_organizacao_social = atividade_organizacao_social;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }

    public String getFile2() {
        return file2;
    }

    public void setFile2(String file2) {
        this.file2 = file2;
    }

    public String getFile3() {
        return file3;
    }

    public void setFile3(String file3) {
        this.file3 = file3;
    }

    public String getFile4() {
        return file4;
    }

    public void setFile4(String file4) {
        this.file4 = file4;
    }

    public String getFile5() {
        return file5;
    }

    public void setFile5(String file5) {
        this.file5 = file5;
    }

    public String getFile6() {
        return file6;
    }

    public void setFile6(String file6) {
        this.file6 = file6;
    }

    public String getFile7() {
        return file7;
    }

    public void setFile7(String file7) {
        this.file7 = file7;
    }
    
    
    
    
}
