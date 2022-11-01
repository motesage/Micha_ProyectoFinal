import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CabezalComponent } from './componentes/cabezal/cabezal.component';
import { Logo1Component } from './componentes/logo1/logo1.component';
import { Logo2Component } from './componentes/logo2/logo2.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { AboutComponent } from './componentes/about/about.component';

@NgModule({
  declarations: [
    AppComponent,
    CabezalComponent,
    Logo1Component,
    Logo2Component,
    BannerComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
