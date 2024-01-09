// app-routing.module.ts
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DoctorDetailsComponent } from './doctor-details/doctor-details.component';
import { PatientsDetailsComponent } from './patients-details/patients-details.component';

const routes: Routes = [
  { path: '', redirectTo: '/doctorDetails', pathMatch: 'full' },
  { path: 'doctorDetails', component: DoctorDetailsComponent },
  { path: 'patientsDetails', component: PatientsDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
