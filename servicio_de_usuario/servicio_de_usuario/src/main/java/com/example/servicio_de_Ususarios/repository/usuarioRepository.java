package com.example.servicio_de_Ususarios.repository;

import com.example.servicio_de_Ususarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends JpaRepository<Usuario, Integer> {

}
