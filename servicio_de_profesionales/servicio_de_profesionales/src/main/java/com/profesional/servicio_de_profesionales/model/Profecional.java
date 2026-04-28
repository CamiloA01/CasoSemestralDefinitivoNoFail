package com.profesional.servicio_de_profesionales.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "profecional")
public class Profecional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String pnombre;

    @Column(nullable = false)
    private String apellidopa;

    @Column(nullable = false)
    private String apellidoma;

    @Column(nullable = false, length = 13)
    private String run;

    //Es lo que estudio
    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private int anio_experiencia;

    //Datos que aun no se como se implementan: usuarioId, especialidadId
    
}
