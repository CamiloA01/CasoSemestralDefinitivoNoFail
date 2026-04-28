package com.profesional.servicio_de_profesionales.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfecionalResponceDTO {
    private Long id;
    private String pnombre;
    private String apellidopa;
    private String apellidoma;
    private String run;
    private String titulo;
    private int anio_experiencia;
}
