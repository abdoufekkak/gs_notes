import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatIconModule } from '@angular/material/icon';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { GestionProfComponent } from './gestion-prof/gestion-prof.component';
import { GestionAdminComponent } from './gestion-admin/gestion-admin.component';
import { GestionSemesterComponent } from './gestion-semester/gestion-semester.component';
import { GestionModuleComponent } from './gestion-module/gestion-module.component';
import { GestionFiliereComponent } from './gestion-filiere/gestion-filiere.component';
import { GestionEtudiantComponent } from './gestion-etudiant/gestion-etudiant.component';
import { GestionElementComponent } from './gestion-element/gestion-element.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { AdminsComponent } from './gestion-admin/components/admins/admins.component';
import { ProfsComponent } from './gestion-prof/components/profs/profs.component';
import { ElementsComponent } from './gestion-element/components/elements/elements.component';
import { EtudiantsComponent } from './gestion-etudiant/components/etudiants/etudiants.component';
import { ModulesComponent } from './gestion-module/components/modules/modules.component';
import { SemestresComponent } from './gestion-semester/components/semestres/semestres.component';
import { FilieresComponent } from './gestion-filiere/filieres/filieres.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DialogOverviewExampleDialog } from './gestion-admin/components/dialog/dialog.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    GestionProfComponent,
    GestionAdminComponent,
    GestionSemesterComponent,
    GestionModuleComponent,
    GestionFiliereComponent,
    GestionEtudiantComponent,
    GestionElementComponent,
    NavBarComponent,
    AdminsComponent,
    ProfsComponent,
    ElementsComponent,
    EtudiantsComponent,
    ModulesComponent,
    SemestresComponent,
    FilieresComponent,
    
  ],
  imports: [BrowserModule, AppRoutingModule, MatIconModule, HttpClientModule, BrowserAnimationsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
