import { Component,Input } from '@angular/core';
import { Admin } from '../../model/admin.model';
import { MatDialog } from '@angular/material/dialog';
import { DialogOverviewExampleDialog } from '../dialog/dialog.component';

@Component({
  selector: 'app-admins',
  templateUrl: './admins.component.html',
  styleUrls: ['./admins.component.scss']
})
export class AdminsComponent {

  @Input() admins!:Admin[];
  constructor(    public dialog: MatDialog,
    ){

    }
  openDialog(): void {
    // this.msg = msg;
    const dialogRef = this.dialog.open(DialogOverviewExampleDialog, {
      data: null, // data is a data that we send it to the dialog
    });
  }
}
