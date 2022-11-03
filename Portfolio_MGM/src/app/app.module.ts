import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgCircleProgressModule } from 'ng-circle-progress';

import { CabezalComponent } from './componentes/cabezal/cabezal.component';
import { Logo1Component } from './componentes/logo1/logo1.component';
import { Logo2Component } from './componentes/logo2/logo2.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { AboutComponent } from './componentes/about/about.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import { HabilidadesComponent } from './componentes/habilidades/habilidades.component';

@NgModule({
  declarations: [
    AppComponent,
    CabezalComponent,
    Logo1Component,
    Logo2Component,
    BannerComponent,
    AboutComponent,
    ExperienciaComponent,
    EducacionComponent,
    HabilidadesComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    NgCircleProgressModule.forRoot({
      radius:100,
      outerStrokeWidth:16,
      innerStrokeWidth:8,
      outerStrokeColor:"#8E44AD",
      innerStrokeColor:"#5B2C6F",
      titleFontSize:"25px",
      subtitleColor:"#5B2C6F",
      animation:true,
      animationDuration:500,
      showUnits:false,
      subtitleFontSize:"25px"
    })
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
