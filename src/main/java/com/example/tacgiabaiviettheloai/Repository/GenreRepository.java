package com.example.tacgiabaiviettheloai.Repository;

import com.example.tacgiabaiviettheloai.Model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Integer> {
}
