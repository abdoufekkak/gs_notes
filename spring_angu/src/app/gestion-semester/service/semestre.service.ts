import { HttpClient } from '@angular/common/http';
import { api } from 'src/app/api';
import { Semestre } from '../model/semestre.model';
import { Observable, BehaviorSubject } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({ providedIn: 'root' })
export class SemestreService {
  constructor(private http: HttpClient) {}

  getSemestres(): Observable<Semestre[]> {
    return this.http.get<Semestre[]>(`${api}/semestre/`);
  }
  addSemestre(semestre: Semestre) {
    return this.http.post(`${api}/semestre/}`, semestre);
  }

  deletSemestre(id: number) {
    return this.http.delete(`${api}/semestre/${id}`);
  }
  modSemestre(id: number, semestre: Semestre) {
    return this.http.put(`${api}/semestre/${id}`, semestre);
  }
}
