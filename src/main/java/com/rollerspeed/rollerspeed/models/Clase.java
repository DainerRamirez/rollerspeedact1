package com.rollerspeed.rollerspeed.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "clases")
@Data
public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreClase;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String dia; // Ej: Lunes, Martes, etc.

    @Column(nullable = false)
    private String horaInicio; // Ej: "15:00"

    @Column(nullable = false)
    private String horaFin; // Ej: "17:00"

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false)
    private Instructor instructor;
}
