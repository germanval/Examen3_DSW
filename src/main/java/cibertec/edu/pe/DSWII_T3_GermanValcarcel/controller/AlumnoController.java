package cibertec.edu.pe.DSWII_T3_GermanValcarcel.controller;

import cibertec.edu.pe.DSWII_T3_GermanValcarcel.model.Alumno;
import cibertec.edu.pe.DSWII_T3_GermanValcarcel.model.dto.DtoAlumno;
import cibertec.edu.pe.DSWII_T3_GermanValcarcel.model.dto.DtoEntity;
import cibertec.edu.pe.DSWII_T3_GermanValcarcel.services.IAlumnoService;
import cibertec.edu.pe.DSWII_T3_GermanValcarcel.util.DtoUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@PreAuthorize("hasRole('SUPERVISOR')")
@RestController
@RequestMapping("api/v2/alumno")
@AllArgsConstructor
public class AlumnoController {
private IAlumnoService iAlumnoService;
    @GetMapping("")
    public ResponseEntity<List<Alumno>> listarAlumnos(){
        List<Alumno> alumnoDtoList = new ArrayList<>(iAlumnoService.listarAlumno());
        if(alumnoDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(alumnoDtoList, HttpStatus.OK);
    }

  @GetMapping("/dto")
    public ResponseEntity<List<DtoEntity>> listaralumnos(){
        List<DtoEntity> alumnodtolist =new ArrayList<>();
      alumnodtolist = iAlumnoService.listarAlumno()
                .stream()
                .map(x -> new DtoUtil().convertirtADto(x,new DtoAlumno()))
                .collect(Collectors.toList());
        if(alumnodtolist.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(alumnodtolist, HttpStatus.OK);
    }
}
