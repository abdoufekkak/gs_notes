import { Component,OnInit } from '@angular/core';
import { Admin } from './model/admin.model';
import { ServiceAdmin } from './service/admin.service';

@Component({
  selector: 'app-gestion-admin',
  templateUrl: './gestion-admin.component.html',
  styleUrls: ['./gestion-admin.component.scss']
})
export class GestionAdminComponent implements OnInit{

  admins!:Admin[];
constructor(public serviceadmin:ServiceAdmin){
  
}


  ngOnInit(): void {
    // this.serviceadmin.getAdmin().subscribe(e=>this.admins=e,err=>console.log(err))
  }
}
