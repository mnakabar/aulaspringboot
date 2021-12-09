package com.developper.springboot.service;

import com.developper.springboot.dto.UsuarioDTO;
import com.developper.springboot.entities.Usuario;
import com.developper.springboot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioDTO usuarioDTO (Long id){
        Usuario entities = usuarioRepository.findById(id).get();
        UsuarioDTO dto = new UsuarioDTO(entities);
        return dto;


   }


}
