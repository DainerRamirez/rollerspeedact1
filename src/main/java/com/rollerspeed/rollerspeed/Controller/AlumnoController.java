package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.models.Alumno;
import com.rollerspeed.rollerspeed.service.AlumnoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

    private final AlumnoService alumnoService;

    // Inyección de dependencias por constructor
    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    // Vista principal del módulo de alumnos
    @GetMapping("/modalumnos")
    public String moduloAlumnos() {
        return "alumno/modalumnos";
        // Renderiza: src/main/resources/templates/alumno/modalumnos.html
    }

    // Formulario de registro de alumnos
    @GetMapping("/registro")
    public String registroAlumno() {
        return "alumno/registro";
        // Renderiza: src/main/resources/templates/alumno/registro.html
    }

    // Guardar alumno en la BD
    @PostMapping("/registro")
    public String guardarAlumno(@ModelAttribute Alumno alumno) {
        alumnoService.guardarAlumno(alumno);
        return "redirect:/alumnos/listar";
        // Después de registrar, redirige al listado
    }

    // Listar alumnos
    @GetMapping("/listar")
    public String listarAlumnos(Model model) {
        model.addAttribute("alumnos", alumnoService.listarAlumnos());
        return "alumno/listar";
        // Renderiza: src/main/resources/templates/alumno/listar.html
    }

    // Calendario de alumnos
    @GetMapping("/calendario")
    public String calendarioAlumnos(Model model) {
        model.addAttribute("alumnos", alumnoService.listarAlumnos());
        return "alumno/calendario";
        // Renderiza: src/main/resources/templates/alumno/calendario.html
    }
}
