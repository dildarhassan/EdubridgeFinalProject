import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-services-component',
  templateUrl: './services-component.component.html',
  styleUrls: ['./services-component.component.css']
})
export class ServicesComponentComponent {

  constructor(private router: Router) { }
  
navigateToService(serviceName: string) {
  this.router.navigate(['doctors-table', serviceName]);
}
}
