package com.imli.Retiro.dto;

import com.imli.Retiro.enums.Cargo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private Cargo cargo;
    private boolean ativo;
}
