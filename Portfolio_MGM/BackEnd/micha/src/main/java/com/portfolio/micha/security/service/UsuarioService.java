package com.portfolio.micha.security.service;

import com.portfolio.micha.security.model.Usuario;
import com.portfolio.micha.security.repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional // garantiza la persistencia (transaccion => Commit o rollback)

public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
      return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existByNombreUsuario(String nombreUsuario){
      return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existByEmail(String email){
      return iusuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
      iusuarioRepository.save(usuario);
        
    }
    
    
    
}
