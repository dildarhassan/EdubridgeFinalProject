import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { OnInit } from '@angular/core';
import { DoctorByDescService } from '../Services/doctor-by-desc.service';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { BookingFormComponent } from '../booking-form/booking-form.component';

@Component({
  selector: 'app-doctors-table',
  templateUrl: './doctors-table.component.html',
  styleUrls: ['./doctors-table.component.css']
})
export class DoctorsTableComponent implements OnInit {
  serviceName : string;
  doctors: any[];

  constructor(private route: ActivatedRoute,private doctorService:DoctorByDescService,private modalService: NgbModal) {}

  openBookingForm(doctorId: number) {
    console.log(doctorId)
    const modalRef = this.modalService.open(BookingFormComponent, { centered: true });
    modalRef.componentInstance.doctorId = doctorId;
  }

  ngOnInit() {
    
    this.route.paramMap.subscribe(params => {
      this.serviceName = params.get('serviceName');
      
    });
    this.doctorService.getDoctors(this.serviceName).subscribe((data) => {
      this.doctors = data;
      console.log(data)
    });
  }


}