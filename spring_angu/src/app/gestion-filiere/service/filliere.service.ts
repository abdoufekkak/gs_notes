import { Injectable } from '@angular/core';
import { Filiere } from '../model/filiere.model'; 
import { HttpClient } from '@angular/common/http';
import { Observable ,BehaviorSubject} from 'rxjs';
import { api } from 'src/app/api';

@Injectable({
  providedIn: 'root',
})
export class serviceFiliere{

  private admins: Filiere[] = [];

  constructor(private http: HttpClient) {}

  
  getFiliere() : Observable<Filiere[]>{
 
      return this.http.get<Filiere[]>(`${api}/filiere/`);
     
    
  }

  addadmin(filiere:Filiere) :Observable<any>{
    return this.http.post<any>(`${api}/admin/`,filiere)

  }

  deleteFiliere(id?:number):Observable<any>{
    return this.http.delete<any>(`${api}/Filiere/${id}`)
  }
  updateadmin(filiere:Filiere,id?:number) {

    return this.http.put<any>(`${api}/Filiere/${id}`,filiere)

  }
  



}
