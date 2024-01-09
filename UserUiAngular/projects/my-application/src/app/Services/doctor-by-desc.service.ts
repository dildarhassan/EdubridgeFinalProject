import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { HttpParams } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DoctorByDescService {

  private apiUrl = 'http://localhost:8080/serviceController'; 

  constructor(private http: HttpClient) {}

  getDoctors(des:any): Observable<any> {
    //const params = new HttpParams().set('docDesk',docDesk);
    //const params = new HttpParams().set('desc', desc);

    // Adding params to the options object
   // const options = { params };
  //  let headers = new HttpHeaders();
  //  headers.append('Access-Control-Allow-Origin', '*');  
    return this.http.get(this.apiUrl+"/getDoctorsByDesc/"+des);
  }
}
