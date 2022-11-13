
package com.portfolio.micha.service;

import com.portfolio.micha.model.Perfil;
import com.portfolio.micha.repository.iPerfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class perfilService implements IPerfilService {
    @Autowired iPerfilRepository iPerfilRepository;
    
    @Override
    public List<Perfil> getPerfil() {
       List<Perfil> perfil = iPerfilRepository.findAll();
       return perfil;
               }

    @Override
    public void savePerfil(Perfil perf) {
        iPerfilRepository.save(perf);
    }

    @Override
    public void deletePerfil(Long id) {
        iPerfilRepository.deleteById(id);
    }

    @Override
    public Perfil findPerfil(Long id) {
        return iPerfilRepository.findById(id).orElse(null);    
    }
    
}
