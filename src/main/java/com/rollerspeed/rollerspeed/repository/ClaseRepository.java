package com.rollerspeed.rollerspeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rollerspeed.rollerspeed.models.Alumno;

@Repository
public interface ClaseRepository extends JpaRepository<Alumno, Long> {

    // Puedes agregar consultas personalizadas si las necesitas:
    // List<Alumno> findByNombreContaining(String nombre);
}
