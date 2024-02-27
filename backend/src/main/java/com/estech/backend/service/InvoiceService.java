package com.estech.backend.service;

import com.estech.backend.model.Invoice;
import com.estech.backend.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public Invoice saveInvoice(Invoice invoice) {

        return invoiceRepository.save(invoice);
    }

}
