import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { AboutComponentComponent } from './about-component/about-component.component';
import { ServicesComponentComponent } from './services-component/services-component.component';
import { ContactComponentComponent } from './contact-component/contact-component.component';
import { DoctorsTableComponent } from './doctors-table/doctors-table.component';
import { NgbCarousel } from '@ng-bootstrap/ng-bootstrap';
import { CarouselComponent } from './carousal/carousal.component';

import { BookingFormComponent } from './booking-form/booking-form.component';





@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    HomeComponentComponent,
    AboutComponentComponent,
    ServicesComponentComponent,
    ContactComponentComponent,
    DoctorsTableComponent,
    CarouselComponent,
    BookingFormComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule,
     FormsModule,
    ReactiveFormsModule,
    NgbCarousel
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
