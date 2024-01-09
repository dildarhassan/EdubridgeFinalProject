import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class PatientsDetailsService {
  private apiUrl = 'http://localhost:8080/patientController'; 


  constructor(private http:HttpClient) { }

  getPatients(): Observable<any> {
     
    return this.http.get(this.apiUrl+"/getAll");
  }
}
