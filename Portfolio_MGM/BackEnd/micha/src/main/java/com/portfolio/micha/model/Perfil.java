package com.portfolio.micha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

// para incluir los getters y setters automaticamente sin codigo
@Getter @Setter

@Entity
public class Perfil {
    // las annotations van ANTES del campo que afectan !!
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=1, max=30, message = "Tamaño entre 1 y 30 caracteres")
    private String nombre;

    @NotNull
    @Size(min=1, max=30, message = "Tamaño entre 1 y 30 caracteres")
    private String apellido;

    @Size(min=1, max=60, message = "Tamaño entre 1 y 60 caracteres")
    private String fileImagen;
    
}
