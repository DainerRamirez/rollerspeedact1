package com.rollerspeed.rollerspeed.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "instructores")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String correo;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String nivelExperiencia; // principiante, avanzado, etc.
}
