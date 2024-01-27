package com.example.s28866Bank.repository;

import com.example.s28866Bank.entity.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ClientDao {

    private List<Client> clients = new ArrayList<>();

    public List<Client> getClients(){

        clients.add(Client.builder().id(1).amount(200).build());
        clients.add(Client.builder().id(2).amount(1247621).build());
        clients.add(Client.builder().id(3).amount(31238).build());
        clients.add(Client.builder().id(4).amount(123876).build());
        clients.add(Client.builder().id(5).amount(12376).build());

        return clients;
    }

    public Optional<Client> getClientById(int id){
        return getClients()
                .stream()
                .filter(client -> client.getId() == id)
                .findFirst();
    }
    public Optional<Client> doTransactionMinus(int userId,int amount){

        var client = getClientById(userId);

        client.get().setAmount(client.get().getAmount() - amount);

        return getClientById(userId);
    }
    public Optional<Client> doTransactionPlus(int userId,int amount){

        var client = getClientById(userId);

        client.get().setAmount(client.get().getAmount() + amount);

        return getClientById(userId);
    }

    public Optional<Client> checkCredent(int userid){

        return getClientById(userid);
    }

}
