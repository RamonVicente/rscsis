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
@Table(name="TB_RSC2")
@Entity
@Access(AccessType.FIELD)
public class RSC2 implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private int orientacao_cooerientacao_tcc;
    private int orientacao_tutoria_supervisao_1;
    private int orientacao_tutoria_supervisao_2;
    private int orientacao_tutoria_supervisao_3;
    private int orientacao_tutoria_supervisao_4;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO", nullable = false)
    private Usuario usuario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getOrientacao_cooerientacao_tcc() {
        return orientacao_cooerientacao_tcc;
    }

    public void setOrientacao_cooerientacao_tcc(int orientacao_cooerientacao_tcc) {
        this.orientacao_cooerientacao_tcc = orientacao_cooerientacao_tcc;
    }

    public int getOrientacao_tutoria_supervisao_1() {
        return orientacao_tutoria_supervisao_1;
    }

    public void setOrientacao_tutoria_supervisao_1(int orientacao_tutoria_supervisao_1) {
        this.orientacao_tutoria_supervisao_1 = orientacao_tutoria_supervisao_1;
    }

    public int getOrientacao_tutoria_supervisao_2() {
        return orientacao_tutoria_supervisao_2;
    }

    public void setOrientacao_tutoria_supervisao_2(int orientacao_tutoria_supervisao_2) {
        this.orientacao_tutoria_supervisao_2 = orientacao_tutoria_supervisao_2;
    }

    public int getOrientacao_tutoria_supervisao_3() {
        return orientacao_tutoria_supervisao_3;
    }

    public void setOrientacao_tutoria_supervisao_3(int orientacao_tutoria_supervisao_3) {
        this.orientacao_tutoria_supervisao_3 = orientacao_tutoria_supervisao_3;
    }

    public int getOrientacao_tutoria_supervisao_4() {
        return orientacao_tutoria_supervisao_4;
    }

    public void setOrientacao_tutoria_supervisao_4(int orientacao_tutoria_supervisao_4) {
        this.orientacao_tutoria_supervisao_4 = orientacao_tutoria_supervisao_4;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
