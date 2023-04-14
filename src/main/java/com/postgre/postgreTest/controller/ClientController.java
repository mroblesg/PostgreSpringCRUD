package com.postgre.postgreTest.controller;

import com.postgre.postgreTest.models.Client;
import com.postgre.postgreTest.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin() // Open for all ports
@RestController
public class ClientController {

    @Autowired
    private ClientRepository clientRepo;

    @GetMapping("/clients")
    public ResponseEntity<List<Client>> listAll() {
        try {
            return new ResponseEntity<>(clientRepo.findAll(), HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/client")
    public ResponseEntity<Client> newClient(@RequestBody Client client) {

        //Client client = new Client();
        //client.setName("Miguel");
        //client.setEmail("miguel00rg@hotmail.com");

        //clientRepo.save(client);

        System.out.println(client);

        return new ResponseEntity<>(client, HttpStatus.OK);

    }

}