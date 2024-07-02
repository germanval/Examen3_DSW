package cibertec.edu.pe.DSWII_T3_GermanValcarcel.model.dto;


import lombok.Data;


@Data
public class DtoAlumno implements DtoEntity{

    private String apealumno;
    private String nomalumno;
    private String nomcurso;
    private Float exaparcial;
    private Float exafinal;
}
