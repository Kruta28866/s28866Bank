package com.example.s28866Bank.repository;

import com.example.s28866Bank.entity.Bank;
import com.example.s28866Bank.types.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BankDao {
    private List<Bank> bank = new ArrayList<>();

    private final ClientDao clientRepository;

    @Autowired
    public BankDao(ClientDao clientRepository) {
        this.clientRepository = clientRepository;
    }


    public List<Bank> getBank() {


        bank.add(Bank.builder().userId(1).transactionStatus(TransactionStatus.ACCEPTED).build());
        bank.add(Bank.builder().userId(2).transactionStatus(TransactionStatus.DECLINED).build());
        bank.add(Bank.builder().userId(3).transactionStatus(TransactionStatus.ACCEPTED).build());
        bank.add(Bank.builder().userId(4).transactionStatus(TransactionStatus.ACCEPTED).build());

        return bank;
    }

    public void addToBank(Bank bank1) {
        bank.add(bank1);
    }

    public Optional<Bank> getBankByID(int userId) {

        return getBank()
                .stream()
                .filter(bank1 -> bank1.getUserId() == userId)
                .findFirst();

    }


}
