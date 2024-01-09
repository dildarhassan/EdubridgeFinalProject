import { Component, Input } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { PatientDetailsServiceService } from '../Services/patient-details-service.service';


@Component({
  selector: 'app-booking-form',
  templateUrl: './booking-form.component.html',
  styleUrls: ['./booking-form.component.css']
})
export class BookingFormComponent {
  @Input() doctorId: any;


  booking: any = {
  };
  

  constructor(public activeModal: NgbActiveModal,public patientDetails:PatientDetailsServiceService) {}

  submitForm() {
    this.booking.did = this.doctorId;
    this.add();
    
}

    add(){
      let jsonData = {
        doctorId: this.doctorId,
        bookedBy: this.booking.bookedBy,
        contactNo: this.booking.contactNo,
        patientName: this.booking.patientName,
        date: this.booking.date
      };
     
      this.patientDetails.postCustomer(jsonData).subscribe(response => {
        console.log('Form submitted successfully:',response);
        console.log('Form submitted:',this.doctorId, this.booking)
       });
      this.activeModal.close();
    } 
  }



