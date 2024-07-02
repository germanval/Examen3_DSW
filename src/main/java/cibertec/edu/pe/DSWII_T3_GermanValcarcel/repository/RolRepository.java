package cibertec.edu.pe.DSWII_T3_GermanValcarcel.repository;

import cibertec.edu.pe.DSWII_T3_GermanValcarcel.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {
    Rol findByNomrol(String nomrol);
}
