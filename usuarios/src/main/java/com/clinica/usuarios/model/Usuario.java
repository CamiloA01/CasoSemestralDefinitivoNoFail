package com.clinica.usuarios.model;


import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    
    @NotBlank(message = "El campo no puede estar vacio")
    private int id;

    @NotBlank(message = "El campo no puede estar vacio")
    private String gmail;

    @NotBlank(message = "El campo no puede estar vacio")
    private String password;

    @NotBlank(message = "El campo no puede estar vacio")
    private String rol;

    @NotBlank(message = "El campo no puede estar vacio")
    private boolean estado;

}
