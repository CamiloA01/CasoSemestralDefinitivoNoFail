package com.example.servicio_de_Ususarios.service;

import com.example.servicio_de_Ususarios.dto.UsuarioRequestDTO;
import com.example.servicio_de_Ususarios.dto.UsuarioResponseDTO;
import com.example.servicio_de_Ususarios.model.Usuario;
import com.example.servicio_de_Ususarios.repository.usuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final usuarioRepository usuarioRepository;

    private UsuarioResponseDTO mapToDTO(Usuario usuario) {
        return new UsuarioResponseDTO(
                usuario.getId(),
                usuario.getUsername(),
                usuario.getGmail(),
                usuario.getPassword(),
                usuario.getRoll(),
                usuario.getEstado()
        );
    }
    //CREAR Y GUARDAR EL USUARIO
    public UsuarioRequestDTO createUsuario(UsuarioRequestDTO requestDTO) {
        Usuario usuario = new Usuario();
        usuario.setUsername(requestDTO.getUsername());
        usuario.setGmail(requestDTO.getGmail());
        usuario.setPassword(requestDTO.getPassword());
        usuario.setRoll(requestDTO.getRoll());
        usuario.setEstado(requestDTO.getEstado());
        
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return mapToDTO(savedUsuario);
    }

    public List<UsuarioResponseDTO> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }


}
