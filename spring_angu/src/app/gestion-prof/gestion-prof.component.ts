import { Component } from '@angular/core';
import { Prof } from './model/prof.model';
import { SemestreProf } from './service/prof.service';

@Component({
  selector: 'app-gestion-prof',
  templateUrl: './gestion-prof.component.html',
  styleUrls: ['./gestion-prof.component.scss'],
})
export class GestionProfComponent {
  profs!: Prof[];

  constructor(public serviceProf: SemestreProf) {}
  ngOnInit(): void {
    this.serviceProf.getProfs().subscribe(
      (e) => (this.profs = e),
      (err) => console.log(err)
    );
  }
}
