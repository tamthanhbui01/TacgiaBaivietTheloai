package com.example.tacgiabaiviettheloai.Controller;

import com.example.tacgiabaiviettheloai.Model.Article;
import com.example.tacgiabaiviettheloai.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @GetMapping("/Articles")
    public List<Article> findAllArticles(){
        return articleService.findAllArticles();
    }
    @GetMapping("/searchArticle")
    public List<Article> findByGenre(@RequestParam String genreName){
       return articleService.findByGenre(genreName);
    }
}
