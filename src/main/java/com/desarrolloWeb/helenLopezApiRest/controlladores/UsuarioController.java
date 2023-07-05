package com.desarrolloWeb.helenLopezApiRest.controlladores;

import com.desarrolloWeb.helenLopezApiRest.persistencia.entidades.Usuario;
import com.desarrolloWeb.helenLopezApiRest.servicios.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {


    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("usuarios/all")
    public List<Usuario> getAll(){

    return usuariosService.getAllUsuario();
    }

    @GetMapping("usuario/{id}")
    public Usuario getById(@PathVariable("id") Long id){

        return usuariosService.getUsuarioById(id);
    }

    @GetMapping("usuario/name/{nombre}")
    public Usuario getByNombre(@PathVariable("nombre") String nombre){

        return usuariosService.getUsuarioByNombre(nombre);
    }

    @PutMapping("/usuario")
    public Usuario updateUsuario(@RequestBody Usuario usuario){

        return usuariosService.updateUsuario(usuario);
    }

    @DeleteMapping("usuario/{id}")
    public void deleteUsuario(@PathVariable("id") Long id){

        usuariosService.deleteUsuario(id);
    }


}
