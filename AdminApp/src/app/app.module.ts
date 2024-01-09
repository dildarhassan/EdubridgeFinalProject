import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DoctorDetailsComponent } from './doctor-details/doctor-details.component';
import { PatientsDetailsComponent } from './patients-details/patients-details.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { FormGroup, ReactiveFormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    DoctorDetailsComponent,
    PatientsDetailsComponent,
    NavBarComponent
  ],
  imports: [
    
    BrowserModule,
    AppRoutingModule,
   ReactiveFormsModule,
   HttpClientModule
   
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
