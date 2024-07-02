package cibertec.edu.pe.DSWII_T3_GermanValcarcel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idalumno;
    private String apealumno;
    private String nomalumno;
    private String idespecialidad;
    private String proce;
    @ManyToMany(
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER)
    @JoinTable(name = "notas",
            joinColumns = @JoinColumn(name = "idAlumno"),
            inverseJoinColumns = @JoinColumn(name = "idCurso"))
    private Set<Curso> cursos = new HashSet<>();
}
