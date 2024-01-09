import { Component,OnInit } from '@angular/core';
import { PatientsDetailsService } from 'Service/patients-details.service';


@Component({
  selector: 'app-patients-details',
  templateUrl: './patients-details.component.html',
  styleUrls: ['./patients-details.component.css']
})
export class PatientsDetailsComponent implements OnInit {
  bookings:any[]=[];

  constructor(private ps:PatientsDetailsService){}

  ngOnInit() {
    this.getPatients();
  }



  getPatients(){
  this.ps.getPatients().subscribe((data) => {
    this.bookings = data;
    console.log(data)
  });
}
}

