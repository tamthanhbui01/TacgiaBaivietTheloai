package com.example.tacgiabaiviettheloai.Service;

import com.example.tacgiabaiviettheloai.Repository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WriterService {
    @Autowired
    private WriterRepository writerRepository;
}
