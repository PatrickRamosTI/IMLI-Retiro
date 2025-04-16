package com.imli.Retiro.dto;

import com.imli.Retiro.enums.Cargo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioRequestDTO {

    @NotBlank(message = "Nome é obrigatorio")
    private String nome;

    @NotBlank(message = "Email é obrigatorio")
    @Email(message = "Email inválido")
    private String email;

    @NotBlank(message = "Senha é obrigatoria")
    private String senha;

    @NotBlank(message = "Cargo é obrigatorio")
    private Cargo cargo;
}
