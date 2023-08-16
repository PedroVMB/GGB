package br.edu.unijorge.GGB.services;

import br.edu.unijorge.GGB.domain.news.News;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface INewsService {
    List<News> findAllNews();
    News findById(Long id);
    News createNews(News news);
    News createNews(News news, MultipartFile image) throws IOException;
    News updateNews(News news);
    News updateNews(News news, MultipartFile image) throws IOException;
    Boolean deleteNews(Long id);
}
