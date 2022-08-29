import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Registration } from '../model/registration.model.';


@Injectable({
  providedIn: 'root'
})
export class RegistrationSbService {
  baseUrl: string = "http://localhost:8080/api/v1/registrations";
  constructor(private httpClient: HttpClient) {
  }
  // getRegistrations() {
  //   // get
  //   return this.httpClient.get<Registration[]>(this.baseUrl);;
  // }
  authenticate(email:string, password:string) {
    //get
    return this.httpClient.get<Boolean>(this.baseUrl + "/" + email +  "/" + password);
  }
  createRegistration(registration: Registration) {
    //post : new emp
    return this.httpClient.post(this.baseUrl, registration);
  }

  
  // updateRegistration(id:number, registration:any) : Observable<Object> {
  //   //put : update emp
  //   return this.httpClient.put(`${this.baseUrl}/${id}`, registration);
  // }
  // deleteRegistration(id: number) {
  //   //post
  //   return this.httpClient.delete<Registration>(this.baseUrl + "/" + id);
  // }
}
