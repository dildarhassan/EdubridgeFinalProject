// app-routing.module.ts
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponentComponent } from './home-component/home-component.component';
import { AboutComponentComponent } from './about-component/about-component.component';
import { ServicesComponentComponent } from './services-component/services-component.component';
import { ContactComponentComponent } from './contact-component/contact-component.component';
import { DoctorsTableComponent } from './doctors-table/doctors-table.component';

const routes: Routes = [
  { path: '', redirectTo: '/services', pathMatch: 'full' },
  { path: 'home', component: HomeComponentComponent },
  { path: 'about', component: AboutComponentComponent },
  { path: 'services', component: ServicesComponentComponent },
  { path: 'contact', component: ContactComponentComponent },
  {path: 'doctors-table/:serviceName',component: DoctorsTableComponent,
},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
