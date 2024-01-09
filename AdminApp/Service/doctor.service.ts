import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

 
  private apiUrl = 'http://localhost:8080/serviceController'; 

  constructor(private http:HttpClient ) {}

  postDoctor(doctorDetails:any ):Observable<any>{
    let headers = new HttpHeaders();
    headers.append('Access-Control-Allow-Origin', '*');  
    console.log(doctorDetails);
    return this.http.post(this.apiUrl+"/registerDoctorForm",doctorDetails,{ headers: headers});
  }

  getDoctors(): Observable<any> {
     
    return this.http.get(this.apiUrl+"/getDoctorAllDoctors");
  }

  deleteDoctor(id:number):Observable<any> {
     console.log(id)
    return this.http.delete(this.apiUrl+"/deleteDoctorById/"+id);
  }
}
