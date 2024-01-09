import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ContactUsService } from '../Services/contact-us.service';


@Component({
  selector: 'app-contact-component',
  templateUrl: './contact-component.component.html',
  styleUrls: ['./contact-component.component.css']
})
export class ContactComponentComponent implements OnInit {
  postContactUsForm: FormGroup;

  
  
  constructor(private contactUsService: ContactUsService, private fb: FormBuilder) { }

  ngOnInit() {
    this.postContactUsForm = this.fb.group({
      firstName: [null, Validators.required],
      lastName: [null, Validators.required],
      email: [null, [Validators.required, Validators.email]],
      service: [null, Validators.required],
      mobile: [null, Validators.required],
      hearAboutUs: [null, Validators.required],
      message: [null, Validators.required]
    });
  }

  onSubmit() {
  if (this.postContactUsForm.valid) {
      this.contactUsService.postCustomer(this.postContactUsForm.value).subscribe(response => {
       console.log('Form submitted successfully:',response);
       this.postContactUsForm.reset
      });
    } else {
      console.log('Invalid form submission');
    }
  }
}
