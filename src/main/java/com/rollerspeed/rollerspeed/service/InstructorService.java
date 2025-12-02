package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.models.Instructor;
import com.rollerspeed.rollerspeed.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    // Guardar un instructor
    public Instructor guardarInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    // Listar todos los instructores
    public List<Instructor> listarInstructores() {
        return instructorRepository.findAll();
    }

    // Buscar por ID
    public Instructor buscarPorId(Long id) {
        return instructorRepository.findById(id).orElse(null);
    }

    // Eliminar instructor
    public void eliminarInstructor(Long id) {
        instructorRepository.deleteById(id);
    }
}
