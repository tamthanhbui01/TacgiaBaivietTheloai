package com.example.tacgiabaiviettheloai.Controller;

import com.example.tacgiabaiviettheloai.Service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GenreController {
    @Autowired
    private GenreService genreService;
}
