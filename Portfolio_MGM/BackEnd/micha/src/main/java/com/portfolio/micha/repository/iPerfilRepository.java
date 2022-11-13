package com.portfolio.micha.repository;

import com.portfolio.micha.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iPerfilRepository extends JpaRepository<Perfil, Long> {
    // entre <> debo indicar la clase y el tipo del primary key 
}
