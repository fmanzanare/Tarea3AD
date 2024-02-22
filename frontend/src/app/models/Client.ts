import { Invoice } from "./Invoice"

export class Client {
    id: number = 0
    name: string = ''
    lastnameOne: string = ''
    lastnameTwo: string = ''
    email: string = ''
    invoices: Invoice[] = []
}