package com.example.banking_app.mapper;

import com.example.banking_app.dto.AccountDto;
import com.example.banking_app.entity.Account;

public class AccountMapper {
    public static Account maptoAccount(AccountDto accountDto) {

        return new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
    }

    public static AccountDto mapToAccountDto(Account account) {
        return new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
    }
}
