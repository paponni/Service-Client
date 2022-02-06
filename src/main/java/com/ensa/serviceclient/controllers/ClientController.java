package com.ensa.serviceclient.controllers;

import com.ensa.serviceclient.entities.Beneficiaire;
import com.ensa.serviceclient.entities.Client;
import com.ensa.serviceclient.entities.Transfer;
import com.ensa.serviceclient.services.ClientService;
import com.ensa.serviceclient.utils.Login;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping(path = "/historique/{id}")
    ResponseEntity<Collection<Transfer>> getHistorique(@PathVariable Long id){
        return new ResponseEntity<>(clientService.getHistorique(id), HttpStatus.OK);
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> login(@RequestBody Login login){
       return clientService.login(login);
    }
    @PostMapping(path = "/addclient")
    @ResponseStatus(HttpStatus.CREATED)
    public Client addClient(@RequestBody Client client){
        return clientService.addClient(client);
    }

    @PostMapping(path = "/addBenef")
    @ResponseStatus(HttpStatus.CREATED)
    public Beneficiaire addBenef(@RequestBody Beneficiaire benef){
        return clientService.addBenef(benef);
    }

    @PostMapping(path = "/addBenefs")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Beneficiaire> addBenefs(@RequestBody List<Beneficiaire> benefs){

        return clientService.addBenefs(benefs);
    }
    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Client getClient(@PathVariable Long id){
        return clientService.getClient(id);
    }

    @GetMapping(path = "/clients")
    @ResponseStatus(HttpStatus.OK)
    public List<Client> getClients(){
        return clientService.getClients();
    }

    @GetMapping(path = "/beneficiaires")
    @ResponseStatus(HttpStatus.OK)
    public List<Beneficiaire> getBenefs(){
        return clientService.getBenefs();
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Client> deleteClient(@PathVariable Long id){
        return clientService.deleteClient(id);
    }


    @PostMapping("/transfer")
        @ResponseStatus(HttpStatus.CREATED)
        void emisssionTransfert(@RequestBody Transfer transfer){
                clientService.emissionTransfert(transfer);
        }

}


