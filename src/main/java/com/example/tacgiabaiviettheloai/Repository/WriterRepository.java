package com.example.tacgiabaiviettheloai.Repository;

import com.example.tacgiabaiviettheloai.Model.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterRepository extends JpaRepository<Writer,Integer> {
}
