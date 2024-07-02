package cibertec.edu.pe.DSWII_T3_GermanValcarcel.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
    public class IDAlumnoCurso {
    private Integer idalumno;
    private Integer idcurso;
}
