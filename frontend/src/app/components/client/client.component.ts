import { Component } from '@angular/core';
import { Client } from 'src/app/models/Client';
import { ClientService } from 'src/app/services/client.service';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent {

  clients: Client[] = []
  clientName: string = ''

  constructor(private service: ClientService) {}

  getByNombre(): void {
    this.service.getByName(this.clientName).subscribe({
      next: res => this.clients = res,
      error: err => console.error(err)
    })
  }


}
