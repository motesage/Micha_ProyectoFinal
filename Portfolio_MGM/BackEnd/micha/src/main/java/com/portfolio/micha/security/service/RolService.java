package com.portfolio.micha.security.service;

import com.portfolio.micha.security.enums.RolNombre;
import com.portfolio.micha.security.model.Rol;
import com.portfolio.micha.security.repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional // garantiza la persistencia (transaccion => Commit o rollback)
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
      return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
