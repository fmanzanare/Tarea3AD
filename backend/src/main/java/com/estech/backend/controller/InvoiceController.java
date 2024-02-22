package com.estech.backend.controller;

import com.estech.backend.model.Invoice;
import com.estech.backend.service.InvoiceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping
    public Invoice saveInvoice(@Valid @RequestBody Invoice invoice) {
        return invoiceService.saveInvoice(invoice);
    }

}
