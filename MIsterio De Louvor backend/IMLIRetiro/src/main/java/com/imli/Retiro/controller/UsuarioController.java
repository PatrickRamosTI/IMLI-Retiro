package com.imli.Retiro.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.imli.Retiro.entity.Usuario;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final com.imli.Retiro.service.UsuarioService usuarioService;

    public UsuarioController(com.imli.Retiro.service.UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody @Valid Usuario usuario) {
        Usuario novoUsuario = usuarioService.salvar(usuario);
        return ResponseEntity.ok(novoUsuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable Long id) {
        Usuario usuario = usuarioService.buscarUsuarioPorId(id);
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }
}