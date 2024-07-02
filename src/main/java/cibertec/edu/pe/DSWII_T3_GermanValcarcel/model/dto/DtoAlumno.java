package cibertec.edu.pe.DSWII_T3_GermanValcarcel.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class DtoAlumno {
    private String apealumno;
    private String nomalumno;
    private String nomcurso;
    private Float exaparcial;
    private Float exafinal;
}
