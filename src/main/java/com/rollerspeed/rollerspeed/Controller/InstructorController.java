package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.models.Instructor;
import com.rollerspeed.rollerspeed.service.InstructorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/instructores")
public class InstructorController {

    private final InstructorService instructorService;

    // Inyección de dependencias por constructor
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    // Vista principal del módulo de instructores
    @GetMapping("/modinstructor")
    public String moduloInstructores() {
        return "instructor/modinstructor";
        // Renderiza: src/main/resources/templates/instructor/modinstructor.html
    }

    // Formulario de registro de instructores
    @GetMapping("/registro")
    public String registroInstructor() {
        return "instructor/registro";
        // Renderiza: src/main/resources/templates/instructor/registro.html
    }

    // Guardar instructor en la BD
    @PostMapping("/registro")
    public String guardarInstructor(@ModelAttribute Instructor instructor) {
        instructorService.guardarInstructor(instructor);
        return "redirect:/instructores/listar";
        // Después de registrar, redirige al listado
    }

    // Listar instructores
    @GetMapping("/listar")
    public String listarInstructores(Model model) {
        model.addAttribute("instructores", instructorService.listarInstructores());
        return "instructor/listar";
        // Renderiza: src/main/resources/templates/instructor/listar.html
    }

    // Calendario de instructores
    @GetMapping("/calendario")
    public String calendarioInstructores(Model model) {
        model.addAttribute("instructores", instructorService.listarInstructores());
        return "instructor/calendario";
        // Renderiza: src/main/resources/templates/instructor/calendario.html
    }
}
