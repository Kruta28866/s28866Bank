package com.example.s28866Bank.service;

import com.example.s28866Bank.entity.Bank;
import com.example.s28866Bank.entity.Client;
import com.example.s28866Bank.repository.BankDao;
import com.example.s28866Bank.repository.ClientDao;
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


    public void checkTransaction(int userId,int amount){


    }
}
