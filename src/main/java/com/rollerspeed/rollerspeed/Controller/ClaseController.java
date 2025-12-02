package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.models.Clase;
import com.rollerspeed.rollerspeed.service.ClaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clases")
public class ClaseController {

    private final ClaseService claseService;

    public ClaseController(ClaseService claseService) {
        this.claseService = claseService;
    }

    @GetMapping("/modulo")
    public String moduloClases() {
        return "clases/modclases";
    }

    @GetMapping("/registro")
    public String registroClase() {
        return "clases/registro";
    }

    @PostMapping("/registro")
    public String guardarClase(@ModelAttribute Clase clase) {
        claseService.guardarClase(clase);
        return "redirect:/clases/listar"; // después de registrar, redirige al listado
    }

    @GetMapping("/listar")
    public String listarClases(Model model) {
        model.addAttribute("clases", claseService.listarClases());
        return "clases/listar";
    }

    @GetMapping("/calendario")
    public String calendarioClases(Model model) {
        model.addAttribute("clases", claseService.listarClases());
        return "clases/calendario";
    }
}
