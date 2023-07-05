package com.desarrolloWeb.helenLopezApiRest.servicios.impl;

import com.desarrolloWeb.helenLopezApiRest.persistencia.entidades.Docente;
import com.desarrolloWeb.helenLopezApiRest.persistencia.repositorios.DocenteRepository;
import com.desarrolloWeb.helenLopezApiRest.servicios.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DocenteServiceImpl implements DocenteService {


    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public List<Docente> getAllDocente() {
        return List.copyOf((Collection<? extends Docente>) docenteRepository.findAll());
    }

    @Override
    public Docente getDocenteById(Long id) {

        return docenteRepository.findById(id).get();
    }

    @Override
    public Docente getDocenteByNombre(String nombre) {

        return docenteRepository.findByNombre(nombre);
    }

    @Override
    public Docente updateDocente(Docente docente) {

        return docenteRepository.save(docente);
    }

    @Override
    public void deleteDocente(Long id) {
        docenteRepository.deleteById(id);
    }
}
