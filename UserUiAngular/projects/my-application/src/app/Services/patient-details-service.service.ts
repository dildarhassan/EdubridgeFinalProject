import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PatientDetailsServiceService {
  private apiUrl = 'http://localhost:8080/patientController'; 
  constructor(private http: HttpClient) {}

  postCustomer(patient:any ):Observable<any>{
    let headers = new HttpHeaders();
    headers.append('Access-Control-Allow-Origin', '*');  
    console.log(patient);
    return this.http.post(this.apiUrl+"/registerPatient",patient);
  }
}
