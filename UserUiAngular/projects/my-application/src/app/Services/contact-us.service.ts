import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class  ContactUsService {
  private apiUrl = 'http://localhost:8080/contactUsController'; 

  constructor(private http: HttpClient) {}

  postCustomer(customer:any ):Observable<any>{
    let headers = new HttpHeaders();
    headers.append('Access-Control-Allow-Origin', '*');  
    console.log(customer);
    return this.http.post(this.apiUrl+"/submitForm",customer,{ headers: headers});
  }
}
