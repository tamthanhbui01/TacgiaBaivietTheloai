package com.example.tacgiabaiviettheloai.Service;

import com.example.tacgiabaiviettheloai.Model.Article;
import com.example.tacgiabaiviettheloai.Repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> findAllArticles() {
        return articleRepository.findAll();
    }

    public List<Article> findByGenre(String genreName) {
        return articleRepository.findByGenre(genreName); //query 1
    }
}
