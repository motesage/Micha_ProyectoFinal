package com.portfolio.micha.service;

import com.portfolio.micha.model.Perfil;
import java.util.List;

public interface IPerfilService {
  public List<Perfil> getPerfil();
  
  public void savePerfil(Perfil perf);
  
  public void deletePerfil(Long id);
  
  public Perfil findPerfil(Long id);
  
}
