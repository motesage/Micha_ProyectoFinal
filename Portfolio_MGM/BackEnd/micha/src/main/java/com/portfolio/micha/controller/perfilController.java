package com.portfolio.micha.controller;

import com.portfolio.micha.model.Perfil;
import com.portfolio.micha.service.IPerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class perfilController {
    
// la controladora está conectada al servicio
// el servicio al repositorio
// el repositorio a la base de datos
 
   @Autowired 
   private IPerfilService iperfilService;

   @GetMapping("perfiles/traer")
   public List<Perfil> getPerfil(){
       return iperfilService.getPerfil();
   }

   @PostMapping("perfiles/new") 
   public String crearPerfil(@RequestBody Perfil perf) {
       iperfilService.savePerfil(perf);
       return "Perfil " + perf.getId() + " creada";
   }
  
   @DeleteMapping("perfiles/delete/{id}") 
   public String deletePerfil(@PathVariable Long id) {
       iperfilService.deletePerfil(id);
       return "Perfil " + id + " eliminado";
   }

   //localhost:8080/perfiles/edit/4?nombre&apellido&img
   @PutMapping("perfiles/edit/{id}") 
   public Perfil editPerfil(@PathVariable Long id,
           @RequestParam("nombre") String newnombre,
           @RequestParam("apellido") String newapellido,
           @RequestParam("img") String newfileImagen){
       Perfil perf = iperfilService.findPerfil(id);
       perf.setNombre(newnombre);
       perf.setApellido(newapellido);
       perf.setFileImagen(newfileImagen);
       
       iperfilService.savePerfil(perf);
       return perf;
   }

   // Autor debe ser el id 1 !!! 
   @GetMapping("perfiles/traer/autor")
    public Perfil findPerfil(){
        return iperfilService.findPerfil((long)1);
   }
   
    
}
