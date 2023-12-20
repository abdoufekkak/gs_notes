import { api } from 'src/app/api';
import { Prof } from '../model/prof.model';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { Injectable } from '@angular/core';
@Injectable({ providedIn: 'root' })
export class SemestreProf {
  constructor(private http: HttpClient) {}

  getProfs(): Observable<Prof[]> {
    return this.http.get<Prof[]>(`${api}/prof/`);
  }
  addProf(semestre: Prof) {
    return this.http.post(`${api}/prof/}`, semestre);
  }

  deletProf(id: number) {
    return this.http.delete(`${api}/prof/${id}`);
  }
  modProf(id: number, semestre: Prof) {
    return this.http.put(`${api}/prof/${id}`, semestre);
  }
}
