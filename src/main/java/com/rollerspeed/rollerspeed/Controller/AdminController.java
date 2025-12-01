package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    // Panel principal del administrador
    @GetMapping("/admin")
    public String adminHome() {
        return "admin/index";
    }

    // Gestión de usuarios
    @GetMapping("/admin/usuarios")
    public String adminUsuarios() {
        return "admin/usuarios";
    }

    // Configuración del sistema
    @GetMapping("/admin/configuracion")
    public String adminConfiguracion() {
        return "admin/configuracion";
    }
}
