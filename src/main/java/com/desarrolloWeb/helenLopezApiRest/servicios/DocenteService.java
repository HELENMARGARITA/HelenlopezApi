package com.desarrolloWeb.helenLopezApiRest.servicios;

import com.desarrolloWeb.helenLopezApiRest.persistencia.entidades.Docente;
import com.desarrolloWeb.helenLopezApiRest.persistencia.entidades.Usuario;


import java.util.List;

public interface DocenteService {

    List<Docente> getAllDocente();
    Docente getDocenteById(Long id);
    Docente getDocenteByNombre(String nombre);
    Docente updateDocente(Docente usuario);
    void deleteDocente(Long id);

}
