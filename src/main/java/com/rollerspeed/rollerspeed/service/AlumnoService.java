package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.models.Alumno;
import com.rollerspeed.rollerspeed.repository.AlumnoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    // Guardar un alumno
    public Alumno guardarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    // Listar todos los alumnos
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }

    // Buscar por ID
    public Alumno buscarPorId(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    // Eliminar alumno
    public void eliminarAlumno(Long id) {
        alumnoRepository.deleteById(id);
    }
}
