package com.rollerspeed.rollerspeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rollerspeed.rollerspeed.models.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
