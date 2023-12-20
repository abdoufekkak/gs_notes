import { Component, Input, OnInit } from '@angular/core';
import { Prof } from '../../model/prof.model';

@Component({
  selector: 'app-profs',
  templateUrl: './profs.component.html',
  styleUrls: ['./profs.component.scss'],
})
export class ProfsComponent {
  @Input() profs!: Prof[];
}
