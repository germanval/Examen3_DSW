package cibertec.edu.pe.DSWII_T3_GermanValcarcel.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioSeguridadDto {
    private Integer idusuario;
    private String nomusuario;
    private String token;

}
