package com.example.s28866Bank.model;

import com.example.s28866Bank.types.TransactionStatus;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
public class BankResponse {
    private int userId;
    private TransactionStatus transactionStatus;
}
