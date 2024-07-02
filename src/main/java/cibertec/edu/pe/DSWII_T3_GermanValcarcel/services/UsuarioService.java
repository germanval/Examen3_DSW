package cibertec.edu.pe.DSWII_T3_GermanValcarcel.services;

import cibertec.edu.pe.DSWII_T3_GermanValcarcel.model.Usuario;
import cibertec.edu.pe.DSWII_T3_GermanValcarcel.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService{

    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario obtenerUsuarioPorNomUsuario(String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}
