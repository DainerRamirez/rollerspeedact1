package com.rollerspeed.rollerspeed.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "instructores")
@Data
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false, unique = true)
    private String documento;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String especialidad; // Ej: velocidad, patinaje artístico
}
