package com.example.tacgiabaiviettheloai.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tacgia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Writer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_tgia")
    private int writerID;
    @Column(name = "ten_tgia", nullable = false)
    private String writerName;
    @Column(name = "hinh_tgia")
    private String writerPhoto;
    @OneToMany(mappedBy = "writer", cascade = CascadeType.ALL)
    private Set<Article> article=new HashSet<>();
}
