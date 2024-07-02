package cibertec.edu.pe.DSWII_T3_GermanValcarcel.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private String proce;
    @ManyToOne
    @JoinColumn(name = "idesp")
    private Especialidad especialidad;
    @OneToMany(mappedBy = "alumno",
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
        private Set<Notas> curso = new HashSet<>();

}
