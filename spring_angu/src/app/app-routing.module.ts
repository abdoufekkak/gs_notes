import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { GestionAdminComponent } from './gestion-admin/gestion-admin.component';
import { GestionProfComponent } from './gestion-prof/gestion-prof.component';
import { GestionSemesterComponent } from './gestion-semester/gestion-semester.component';
import { GestionFiliereComponent } from './gestion-filiere/gestion-filiere.component';
import { GestionModuleComponent } from './gestion-module/gestion-module.component';
import { GestionEtudiantComponent } from './gestion-etudiant/gestion-etudiant.component';
import { GestionElementComponent } from './gestion-element/gestion-element.component';

const routes: Routes = [
  {
    path: '',
    component: LoginComponent,
  },

  {
    path: '',
    component: NavBarComponent,
    children: [
      { path: 'admin', component: GestionAdminComponent },
      { path: 'prof', component: GestionProfComponent },
      { path: 'semestre', component: GestionSemesterComponent },
      { path: 'filiere', component: GestionFiliereComponent },
      { path: 'module', component: GestionModuleComponent },
      { path: 'element', component: GestionElementComponent },
      { path: 'etudiant', component: GestionEtudiantComponent },
    ],
  },
  { path: '**', redirectTo: '/admin' },
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
