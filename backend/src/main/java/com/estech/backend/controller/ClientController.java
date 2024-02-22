package com.estech.backend.controller;

import com.estech.backend.model.Client;
import com.estech.backend.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/{name}")
    public ResponseEntity<?> getClientByName(@PathVariable String name) {
        List<Client> list = clientService.getClientByName(name);

        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveClient(@Valid @RequestBody Client client) {
        return new ResponseEntity<>(clientService.saveClient(client), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllClients() {
        List<Client> list = clientService.getAllClients();

        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
