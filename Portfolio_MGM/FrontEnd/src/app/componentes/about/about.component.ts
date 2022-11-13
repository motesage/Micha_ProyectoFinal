import { Component, OnInit } from '@angular/core';
import { perfil } from 'src/app/model/perfil.model';
import { PerfilService } from 'src/app/service/perfil.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
  perfil: perfil = new perfil("","","");
  
  /* el constructor llama al servicio ! */
  constructor(public PerfilService: PerfilService) { }

  ngOnInit(): void {
    this.PerfilService.getPerfil().subscribe(datos =>{this.perfil=datos})
  }

}
