package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventosController {

    @GetMapping("/eventos")
    public String eventos() {
        return "eventos/index";
    }

    @GetMapping("/eventos/galeria")
    public String galeriaEventos() {
        return "eventos/galeria";
    }

    @GetMapping("/eventos/proximos")
    public String proximosEventos() {
        return "eventos/proximos";
    }
}
