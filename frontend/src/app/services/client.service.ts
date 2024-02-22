import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Client } from '../models/Client';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  BASE_URL: string = "http://192.168.192.114:9000/api/client"

  constructor(private http: HttpClient) { }

  getAll(): Observable<Client[]> {
    return this.http.get<Client[]>(this.BASE_URL)
  }

  getByName(name: String): Observable<Client[]> {
    return this.http.get<Client[]>(this.BASE_URL + "/" + name)
  }
}
