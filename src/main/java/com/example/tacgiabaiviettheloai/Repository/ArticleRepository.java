package com.example.tacgiabaiviettheloai.Repository;

import com.example.tacgiabaiviettheloai.Model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    @Query("select a from Article a join a.genre g where g.genreName = :genreName")
    List<Article> findByGenre(String genreName);

}
