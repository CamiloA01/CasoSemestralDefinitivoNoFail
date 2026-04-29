package com.example.servicio_de_Ususarios.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioRequestDTO {

    @NotBlank(message = "El nombre de usuario no puede estar vacío")
    private String username;

    @NotBlank(message = "El correo electrónico no puede estar vacío")
    private String gmail;

    @NotBlank(message = "La contraseña no puede estar vacía")
    private String password;

    @NotBlank(message = "El rol no puede estar vacío")
    private String roll;

    @NotBlank(message = "El estado no puede estar vacío")
    private String estado;

}
