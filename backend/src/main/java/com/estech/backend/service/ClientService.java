package com.estech.backend.service;

import com.estech.backend.model.Client;
import com.estech.backend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getClientByName(String name) {
        return clientRepository.findByName(name);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

}
