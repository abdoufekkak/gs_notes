import { Semestre } from '../../model/semestre.model';
import { Component, Input, OnInit } from '@angular/core';
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-semestres',
  templateUrl: './semestres.component.html',
  styleUrls: ['./semestres.component.scss'],
})
export class SemestresComponent {
  @Input() semestres!: Semestre[];
}
