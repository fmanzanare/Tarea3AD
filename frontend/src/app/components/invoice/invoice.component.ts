import { Component } from '@angular/core';
import { Client } from 'src/app/models/Client';
import { Invoice } from 'src/app/models/Invoice';
import { ClientService } from 'src/app/services/client.service';
import { InvoiceService } from 'src/app/services/invoice.service';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.css']
})
export class InvoiceComponent {

  invoices: Invoice[] = []
  amount: string = ''
  clients: Client[] = []
  selectedClient: number = 0
  invoiceToSave: Invoice = new Invoice()

  ngOnInit() {
    this.getClients()
  }

  constructor(private service: InvoiceService, private clientService: ClientService) {
  }

  saveInvoice(): void {
    this.invoiceToSave.amount = Number(this.amount)
    this.invoiceToSave.client = this.selectedClient
    console.log(this.invoiceToSave)
    this.service.saveInvoice(this.invoiceToSave).subscribe({
      next: res => console.log(res),
      error: err => console.error(err)
    })
  }

  getClients(): void {
    this.clientService.getAll().subscribe({
      next: res => this.clients = res,
      error: err => console.error(err)
    })
  }

}
