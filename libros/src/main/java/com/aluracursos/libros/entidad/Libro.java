package com.aluracursos.libros.entidad;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = ("Libro"))
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreLibro;
    private String autor;
    private String editorial;


}
