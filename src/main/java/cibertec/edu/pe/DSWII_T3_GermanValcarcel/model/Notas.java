package cibertec.edu.pe.DSWII_T3_GermanValcarcel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notas")
public class Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idalumno;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcurso;
    private Float exaparcial;
    private Float exafinal;


}
