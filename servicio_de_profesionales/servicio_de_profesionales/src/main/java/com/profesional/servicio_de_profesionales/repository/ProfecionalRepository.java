package com.profesional.servicio_de_profesionales.repository;

import com.profesional.servicio_de_profesionales.model.Profecional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfecionalRepository extends JpaRepository<Profecional, Long>{

}
