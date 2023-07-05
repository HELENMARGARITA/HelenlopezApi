package com.desarrolloWeb.helenLopezApiRest.servicios.impl;

import com.desarrolloWeb.helenLopezApiRest.persistencia.entidades.Usuario;
import com.desarrolloWeb.helenLopezApiRest.persistencia.repositorios.UsuarioRepository;
import com.desarrolloWeb.helenLopezApiRest.servicios.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuariosService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> getAllUsuario() {
        return List.copyOf((Collection<? extends Usuario>) usuarioRepository.findAll());
    }

    @Override
    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public Usuario getUsuarioByNombre(String nombre) {
        return usuarioRepository.findByNombres(nombre);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
