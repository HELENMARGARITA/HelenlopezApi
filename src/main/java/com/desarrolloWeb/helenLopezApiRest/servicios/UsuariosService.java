package com.desarrolloWeb.helenLopezApiRest.servicios;

import com.desarrolloWeb.helenLopezApiRest.persistencia.entidades.Usuario;

import java.util.List;

public interface UsuariosService {
    List<Usuario> getAllUsuario();
    Usuario getUsuarioById(Long id);
    Usuario getUsuarioByNombre(String nombre);
    Usuario updateUsuario(Usuario usuario);
    void deleteUsuario(Long id);

}
