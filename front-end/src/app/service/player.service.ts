import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private http: HttpClient) {
  }

  getPlayer() {
    let basicAuthHeaderString = `Basic ` + window.btoa('eslam@gmail.com' + `:` + '123456');// 64
    let header = new HttpHeaders({
      Authorization: basicAuthHeaderString
    })
    return this.http.get<any>(`http://localhost:8080/football/start`,{headers : header}).pipe(
      map(
        response => {
          console.log(response)
          return response;
        }
      )
    );
  }
}
