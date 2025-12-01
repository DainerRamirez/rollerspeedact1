package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController {

    // Página principal del módulo alumnos
    @GetMapping("/alumnos")
    public String alumnos() {
        return "alumnos/index";
    }

    // Formulario de registro de alumno
    @GetMapping("/alumnos/registro")
    public String registroAlumno() {
        return "alumnos/registro";
    }

    // Listado de alumnos
    @GetMapping("/alumnos/lista")
    public String listaAlumnos() {
        return "alumnos/lista";
    }
}
