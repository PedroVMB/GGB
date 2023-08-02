package br.edu.unijorge.GGB.repositories;

import br.edu.unijorge.GGB.entitys.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News,Long> {
    List<News> findAllByOrderByDateDesc();
}
