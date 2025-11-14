package com.rollerspeed.rollerspeed.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "home/index";
    }

    @RequestMapping("/mision")
    public String mision() {
        return "mision/mision";
    }

    @RequestMapping("/vision")
    public String vision() {
        return "vision/vision";
    }

    @RequestMapping("/valores")
    public String valores() {
        return "valores/valores";
    }

    @RequestMapping("/servicios")
    public String servicios() {
        return "servicios/servicios";
    }

    @RequestMapping("/eventos")
    public String eventos() {
        return "eventos/eventos";
    }
}
