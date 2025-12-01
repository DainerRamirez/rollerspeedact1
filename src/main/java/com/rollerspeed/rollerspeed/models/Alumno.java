package com.rollerspeed.rollerspeed.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String fechaNacimiento;
    private String genero;
    private String correo;
    private String telefono;
    private String medioPago;
}
