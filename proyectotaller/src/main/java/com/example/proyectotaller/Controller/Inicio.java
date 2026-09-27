package com.example.proyectotaller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class Inicio {

    @GetMapping("/") 
    public String inicio() {
        return "inicio";

    }

    @GetMapping ("/cultura-visual")
    public String culturaVisual() {
        return "cultura-visual";
    }

    @GetMapping ("/artesania-digital")
    public String artesaniaDigital() {
        return "artesania-digital";
    }

    @GetMapping ("/arquitectura-de-ideas")
    public String arquitecturaDeIdeas() {
        return "arquitectura-de-ideas";
    }

    @GetMapping ("/estilo-de-vida")
    public String estiloDeVida() {
        return "estilo-de-vida";
    }

    @GetMapping ("/letras-libres")
    public String letrasLibres() {
        return "letras-libres";
    }

    @GetMapping ("/ingresar")
    public String ingresar() {
        return "ingresar";
    }

    @GetMapping ("/crear-cuenta")
    public String crearCuenta() {
        return "crear-cuenta";
    }

    @GetMapping ("/blog")
    public String blog() {
        return "blog";
    }
}
