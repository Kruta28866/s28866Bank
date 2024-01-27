package com.example.s28866Bank.entity;

import com.example.s28866Bank.types.TransactionStatus;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
public class Bank {

    private int userId;
    private TransactionStatus transactionStatus;

}
