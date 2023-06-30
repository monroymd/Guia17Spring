package com.egg.news.news.servicio;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egg.news.news.entidades.Noticia;
import com.egg.news.news.repositorios.NoticiaRepositorio;

@Service
public class NoticiaServicio {

    @Autowired
    NoticiaRepositorio noticiaRepositorio;

    @Transactional
    public void guardarNoticia(String titulo, String cuerpo) {

        Noticia noticia = new Noticia();

        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);

        noticiaRepositorio.save(noticia);

    }

    @Transactional
    public void editarNoticia(String tituloBusqueda, String tituloNuevo) {
        Noticia noticia = noticiaRepositorio.buscarPorTitulo(tituloBusqueda);
        noticia.setTitulo(tituloNuevo);
    }

    @Transactional(readOnly = true)
    public List<Noticia> listarNoticias() {
        List<Noticia> noticias = new ArrayList<>();
        noticias = noticiaRepositorio.findAll();
        return noticias;
    }

    @Transactional
    public void borrarNoticia(String titulo) {
        Noticia noticia = noticiaRepositorio.buscarPorTitulo(titulo);
        noticiaRepositorio.delete(noticia);

    }

}