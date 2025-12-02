package com.rollerspeed.rollerspeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rollerspeed.rollerspeed.models.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    // Consultas personalizadas opcionales:
    // List<Instructor> findByEspecialidad(String especialidad);
}
