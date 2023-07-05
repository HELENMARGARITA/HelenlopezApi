package com.desarrolloWeb.helenLopezApiRest.persistencia.repositorios;

import com.desarrolloWeb.helenLopezApiRest.persistencia.entidades.Docente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends CrudRepository<Docente,Long> {

    Docente findByNombre(String nombre);
}
