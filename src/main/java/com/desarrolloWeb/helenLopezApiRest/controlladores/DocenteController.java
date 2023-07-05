package com.desarrolloWeb.helenLopezApiRest.controlladores;

import com.desarrolloWeb.helenLopezApiRest.persistencia.entidades.Docente;
import com.desarrolloWeb.helenLopezApiRest.servicios.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocenteController {
    @Autowired
    private DocenteService docenteService;

    @GetMapping("docentes/all")
    public List<Docente> getAll(){

        return docenteService.getAllDocente();
    }

    @GetMapping("docente/{id}")
    public Docente getById(@PathVariable("id") Long id){

        return docenteService.getDocenteById(id);
    }

    @GetMapping("docente/name/{nombre}")
    public Docente getByNombre(@PathVariable("nombre") String nombre){

        return docenteService.getDocenteByNombre(nombre);
    }

    @PutMapping("/docente")
    public Docente updateDocente(@RequestBody Docente docente){

        return docenteService.updateDocente(docente);
    }

    @DeleteMapping("docente/{id}")
    public void deleteDocente(@PathVariable("id") Long id){

        docenteService.deleteDocente(id);
    }

}
