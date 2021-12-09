package com.developper.springboot.dto;

import com.developper.springboot.entities.Usuario;

public class UsuarioDTO {

    private Long id;
    private String nome;

    public UsuarioDTO(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public UsuarioDTO(){

    }
   public UsuarioDTO(Usuario usuario){
        id = usuario.getId();
        nome = usuario.getNome();
    }
    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setNome(String  nome){
        this.nome = nome;
    }
}
