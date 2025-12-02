package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.models.Clase;
import com.rollerspeed.rollerspeed.repository.ClaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaseService {

    private final ClaseRepository claseRepository;

    public ClaseService(ClaseRepository claseRepository) {
        this.claseRepository = claseRepository;
    }

    public Clase guardarClase(Clase clase) {
        return claseRepository.save(clase);
    }

    public List<Clase> listarClases() {
        return claseRepository.findAll();
    }
}
