package com.example.tacgiabaiviettheloai.Service;

import com.example.tacgiabaiviettheloai.Repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

}
