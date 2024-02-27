package com.estech.backend.service;

import com.estech.backend.converter.ClientConverter;
import com.estech.backend.dto.ClientDTO;
import com.estech.backend.model.Client;
import com.estech.backend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientConverter clientConverter;

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public List<ClientDTO> getClientByName(String name) {
        List<ClientDTO> clients = new ArrayList<>();
        clientRepository.findByName(name).forEach(client -> {
            clients.add(clientConverter.convertClientToClientDTO(client));
        });
        return clients;
    }

    public List<ClientDTO> getAllClients() {
        List<ClientDTO> clients = new ArrayList<>();
        clientRepository.findAll().forEach(client -> {
            clients.add(clientConverter.convertClientToClientDTO(client));
        });
        return clients;
    }

}
