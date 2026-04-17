package com.clinica.usuarios.model;


import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;


@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, length = 13, nullable = false)
    private String run;

    @Column(nullable = false)
    private String gmail;

    @Column()
    private String password;

    @NotBlank(message = "El campo no puede estar vacio")
    private String rol;

    @NotBlank(message = "El campo no puede estar vacio")
    private boolean estado;

    

}
