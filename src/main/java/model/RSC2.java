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
    
    private String file1;
    private String file2;
    private String file3;
    private String file4;
    private String file5;

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

}
