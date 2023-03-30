package com.spring.codeblog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import javax.validation.constraints.NotBlank;
import lombok.*;


import java.time.LocalDate;
import java.util.Locale;

@Getter
@Setter
@Entity
@Table(name="TB_POST")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate data;

    @NotBlank
    @Lob
    private String texto;

    public Post() {
    }
}
