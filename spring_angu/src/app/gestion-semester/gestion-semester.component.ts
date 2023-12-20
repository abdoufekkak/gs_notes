import { Component, OnInit } from '@angular/core';
import { SemestreService } from './service/semestre.service';
import { Semestre } from './model/semestre.model';

@Component({
  selector: 'app-gestion-semester',
  templateUrl: './gestion-semester.component.html',
  styleUrls: ['./gestion-semester.component.scss'],
})
export class GestionSemesterComponent implements OnInit {
  semestres!: Semestre[];

  constructor(public serviceSemestre: SemestreService) {}
  ngOnInit(): void {
    this.serviceSemestre.getSemestres().subscribe(
      (e) => (this.semestres = e),
      (err) => console.log(err)
    );
  }
}
