package com.example.tacgiabaiviettheloai.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "theloai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_tloai")
    private int ID;
    @Column(name ="ten_tloai", nullable = false)
    private String genreName;
    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    private Set<Article> article= new HashSet<>();
}
