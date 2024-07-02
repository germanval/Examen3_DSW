package cibertec.edu.pe.DSWII_T3_GermanValcarcel.services;

import cibertec.edu.pe.DSWII_T3_GermanValcarcel.model.Alumno;
import cibertec.edu.pe.DSWII_T3_GermanValcarcel.repository.AlumnoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AlumnoService implements IAlumnoService{
    private AlumnoRepository alumnoRepository;
    @Override
    public List<Alumno> listarAlumno() {
        return alumnoRepository.findAll();
    }
}
