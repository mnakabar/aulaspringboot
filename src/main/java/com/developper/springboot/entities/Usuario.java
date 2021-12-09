package com.developper.springboot.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String passaword;

    public Usuario(Long id, String nome, String passaword){
        this.id= id;
        this.nome = nome;
        this.passaword = passaword;
    }
    public Usuario(){

    }

    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getPassaword(){
        return passaword;
    }

    public void setId(Long id ){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPassaword(String passaword){
        this.passaword = passaword;
    }
}
