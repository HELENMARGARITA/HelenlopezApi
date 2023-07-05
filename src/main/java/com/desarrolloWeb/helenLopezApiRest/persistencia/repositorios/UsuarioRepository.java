package com.desarrolloWeb.helenLopezApiRest.persistencia.repositorios;

import com.desarrolloWeb.helenLopezApiRest.persistencia.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {

    Usuario findByNombres(String nombre);
}
