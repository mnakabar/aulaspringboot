package com.developper.springboot.controllers;


import com.developper.springboot.dto.UsuarioDTO;
import com.developper.springboot.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsuarioController {

    @Autowired
    private UsuarioService service;


    @GetMapping(value = "/{id}")
    public UsuarioDTO findById(@PathVariable Long id){
        return service.usuarioDTO(id);

    }
}
