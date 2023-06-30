package com.egg.news.news.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.egg.news.news.entidades.Noticia;

public interface NoticiaRepositorio extends JpaRepository<Noticia, String> {

    // @Query("SELECT * FROM noticias n WHERE n.titulo = :titulo")
    // Noticia buscarPorTitulo(@Param("titulo") String titulo);

}
