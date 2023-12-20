import { Injectable } from '@angular/core';
import { Admin } from '../model/admin.model';
import { HttpClient } from '@angular/common/http';
import { Observable ,BehaviorSubject} from 'rxjs';
import { api } from 'src/app/api';

@Injectable({
  providedIn: 'root',
})
export class ServiceAdmin {

  private admins: Admin[] = [];

  constructor(private http: HttpClient) {}

  
  getAdmin() : Observable<Admin[]>{
 
      return this.http.get<Admin[]>(`${api}/admin/`);
     
    
  }

  addadmin(admin:Admin) :Observable<any>{
    return this.http.post<any>(`${api}/admin/`,admin)

  }

  deleteadmin(id?:number):Observable<any>{
    return this.http.delete<any>(`${api}/admin/${id}`)
  }
  updateadmin(admin:Admin,id?:number) {

    return this.http.put<any>(`${api}/admin/${id}`,admin)

  }
  



}
