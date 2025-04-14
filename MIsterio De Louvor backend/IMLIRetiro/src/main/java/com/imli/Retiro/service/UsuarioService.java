package com.imli.Retiro.service;

import java.util.List;

import com.imli.Retiro.entity.Usuario;
import com.imli.Retiro.repository.UsuarioRepository;

public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    public Usuario salvar(Usuario usuario){
         return usuarioRepository.save(usuario);
    }
    public List<Usuario>listarUsuarios(){
        return usuarioRepository.findAll();
    }
    public Usuario buscarUsuarioId( Long id){
        return usuarioRepository.findById(id).orElse(null);
    }
}
