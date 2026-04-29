package com.example.servicio_de_Ususarios.controller;

import com.example.servicio_de_Ususarios.dto.*;
import com.example.servicio_de_Ususarios.service.*;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/usuarios")    
@RequiredArgsConstructor
public class usuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioRequestDTO> createUsuario(@Valid @RequestBody UsuarioRequestDTO requestDTO) {
        UsuarioRequestDTO createdUsuario = usuarioService.createUsuario(requestDTO);
        return ResponseEntity.ok(createdUsuario);
    }

    @GetMapping
    public ResponseEntity<?> getAllUsuarios() {
        return ResponseEntity.ok(usuarioService.getAllUsuarios());
    }
}
