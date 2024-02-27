package com.estech.backend.converter;

import com.estech.backend.dto.ClientDTO;
import com.estech.backend.model.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientConverter {

    public ClientDTO convertClientToClientDTO(Client client) {
        ClientDTO clientDTO = new ClientDTO();
        List<Double> invoices = new ArrayList<>();

        clientDTO.setId(client.getId());
        clientDTO.setName(client.getName());
        clientDTO.setLastnameOne(client.getLastnameOne());
        clientDTO.setLastnameTwo(client.getLastnameTwo());
        clientDTO.setEmail(client.getEmail());
        client.getInvoices().forEach(invoice -> {
            invoices.add(invoice.getAmount());
        });
        clientDTO.setInvoices(invoices);

        return clientDTO;
    }

}
