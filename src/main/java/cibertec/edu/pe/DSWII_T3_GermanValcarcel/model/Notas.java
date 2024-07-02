package cibertec.edu.pe.DSWII_T3_GermanValcarcel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @EmbeddedId
    private IDAlumnoCurso id;

    private Float exaparcial;
    private Float exafinal;

    @ManyToOne
    @MapsId("idalumno")
    @JoinColumn(name = "idalumno")
    @JsonBackReference
    private Alumno alumno;

    @ManyToOne
    @MapsId("idcurso")
    @JoinColumn(name = "idcurso")
    @JsonBackReference
    private Curso curso;
}
