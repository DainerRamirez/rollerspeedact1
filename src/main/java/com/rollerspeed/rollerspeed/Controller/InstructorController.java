package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/instructores")
public class InstructorController {

    // Página principal del módulo instructores
    @GetMapping
    public String index() {
        return "instructores/index";
    }

    // Formulario para registrar un instructor
    @GetMapping("/registro")
    public String registro() {
        return "instructores/registro";
    }

    // Página para listar instructores registrados
    @GetMapping("/lista")
    public String lista() {
        return "instructores/lista";
    }
}
