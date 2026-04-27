package com.example.servicio_de_Ususarios.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRespnseDTO {
    
    private Integer id;
    private String username;
    private String gmail;
    private String password;
    private String roll;
    private String estado;
}