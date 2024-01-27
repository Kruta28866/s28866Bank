package com.example.s28866Bank.service;

import com.example.s28866Bank.repository.BankDao;
import com.example.s28866Bank.repository.ClientDao;
import com.example.s28866Bank.types.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    private  final BankDao bankRepository;
    private final ClientDao clientRepository;



    @Autowired
    public BankService(BankDao bankRepository, ClientDao clientRepository) {
        this.bankRepository = bankRepository;
        this.clientRepository = clientRepository;
    }


    public boolean checkTransaction(int userId,int amount){
        var order = clientRepository.getClientById(userId);

        if(order.get().getAmount() < amount){
            return false;
        }
        if(order.get().getId() > 0){
            return false;
        }

        var order1 = clientRepository.doTransactionMinus(userId,amount);

        return true;
    }

    public boolean checkTransaction2(int userId,int amount){
        var order = clientRepository.getClientById(userId);

        if(order.get().getAmount() < amount){
            return false;
        }
        if(order.get().getId() > 0){
            return false;
        }

        var order1 = clientRepository.doTransactionPlus(userId,amount);

        return true;
    }

     public TransactionStatus getStatus(int orderId){

        return bankRepository.getBank().get(orderId).getTransactionStatus();
     }
}

