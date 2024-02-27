import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Invoice } from '../models/Invoice';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InvoiceService {

  BASE_URL: string = "http://localhost:9000/api/invoice"
  httpHeaders: HttpHeaders = new HttpHeaders({'content-type': 'application/json'})

  constructor(private http: HttpClient) { }

  saveInvoice(invoice: Invoice): Observable<Invoice> {
    return this.http.post<Invoice>(this.BASE_URL, invoice, {headers: this.httpHeaders})
  }
}
