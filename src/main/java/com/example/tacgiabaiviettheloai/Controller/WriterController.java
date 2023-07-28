package com.example.tacgiabaiviettheloai.Controller;

import com.example.tacgiabaiviettheloai.Service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WriterController {
    @Autowired
    private WriterService writerService;
}
