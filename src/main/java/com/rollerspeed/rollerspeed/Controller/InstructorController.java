package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.models.Instructor;
import com.rollerspeed.rollerspeed.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    private InstructorRepository instructorRepository;

    @GetMapping("/modulo")
    public String modulo() {
        return "instructor/modinstructor";
    }

    @GetMapping("/registro")
    public String registro(Instructor instructor) {
        return "instructor/registro";
    }

    @PostMapping("/registro")
    public String guardar(Instructor instructor) {
        instructorRepository.save(instructor);
        return "redirect:/instructor/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("instructores", instructorRepository.findAll());
        return "instructor/listar";
    }

    @GetMapping("/calendario")
    public String calendario() {
        return "instructor/calendario";
    }
}
