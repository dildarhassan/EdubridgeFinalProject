import { Component,OnInit } from '@angular/core';
import { FormBuilder,FormGroup,Validators } from '@angular/forms';
import { DoctorService } from 'Service/doctor.service';


@Component({
  selector: 'app-doctor-details',
  templateUrl: './doctor-details.component.html',
  styleUrls: ['./doctor-details.component.css']
})
export class DoctorDetailsComponent implements OnInit {

  doctorRegistrationForm!:FormGroup;
  doctors:any[]=[];

  constructor(private doctorService:DoctorService,private fb: FormBuilder) { }

  
  ngOnInit(){
    this.doctorRegistrationForm = this.fb.group({
      name: [null, Validators.required],
      experience: [null, Validators.required],
      languages: [null, Validators.required],
      place: [null, Validators.required],
      qualifications: [null, Validators.required],
      schedule: [null, Validators.required],
      specialization: ["MBBS-", Validators.required],
      time: [null, Validators.required],
    });

    this.doctorService.getDoctors().subscribe((data) => {
      this.doctors = data;
      console.log(data)
    });

  }


  onSubmit(){

    if (this.doctorRegistrationForm.valid) {
      this.doctorService.postDoctor(this.doctorRegistrationForm.value).subscribe(response => {
       console.log('Form submitted successfully:',response);
       this.doctorRegistrationForm.reset
       this.ngOnInit();
      });
    } else {
      console.log('Invalid form submission',this.doctorRegistrationForm.value);
    }
  }

  deleteDoctor(id:number){ 
    console.log(id);
    this.doctorService.deleteDoctor(id).subscribe((res)=>{
    console.log(res)
    this.ngOnInit();
    
  })

  }
  
}
