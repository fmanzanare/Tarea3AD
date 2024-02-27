import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClientComponent } from './components/client/client.component';
import { InvoiceComponent } from './components/invoice/invoice.component';

const routes: Routes = [
  {path: '', component: ClientComponent},
  {path: 'guardar-factura', component: InvoiceComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
