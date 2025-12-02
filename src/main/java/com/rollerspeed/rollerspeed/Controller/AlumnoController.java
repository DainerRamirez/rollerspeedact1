package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.models.Alumno;
import com.rollerspeed.rollerspeed.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("/registro")
    public String registro(Alumno alumno) {
        return "alumno/registro";
    }

    @PostMapping("/registro")
    public String guardar(Alumno alumno) {
        alumnoRepository.save(alumno);
        return "redirect:/alumno/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("alumnos", alumnoRepository.findAll());
        return "alumno/listar";
    }

    @GetMapping("/calendario")
    public String calendario() {
        return "alumno/calendario";
    }

    @GetMapping("/menu")
    public String menu() {
        return "alumno/modalumnos";
    }
}
