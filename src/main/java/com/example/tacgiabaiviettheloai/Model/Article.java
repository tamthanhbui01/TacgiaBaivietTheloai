package com.example.tacgiabaiviettheloai.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "baiviet")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_bviet")
    private int ID;

    @Column(name = "tieude", nullable = false)
    private String title;

    @Column(name = "ten_bhat", nullable = false)
    private String songName;

    @Column(name = "tomtat", nullable = false, columnDefinition = "text")
    private String brief;

    @Column(name = "noidung", columnDefinition = "text")
    private String content;

    @Column(name = "ngayviet", columnDefinition = "", nullable = false)
    private Timestamp dateOfCompose;

    @Column(name = "hinhanh")
    private String photo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ma_tgia")
    private Writer writer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ma_tloai")
    private Genre genre;
}
