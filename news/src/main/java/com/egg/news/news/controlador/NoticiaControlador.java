package com.egg.news.news.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.egg.news.news.servicio.NoticiaServicio;

@Controller
@RequestMapping("/noticia")
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

    @GetMapping("/registrar")
    public String registrar() {
        return "noticia_form.html";
    }

    @PostMapping("/registrar")
    public String registro(@RequestParam String titulo, @RequestParam String cuerpo) {
        noticiaServicio.guardarNoticia(titulo, cuerpo);
        return "noticia_form.html";
    }

}
