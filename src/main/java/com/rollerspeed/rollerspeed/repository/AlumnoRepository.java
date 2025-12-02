package com.rollerspeed.rollerspeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rollerspeed.rollerspeed.models.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
