package com.example.banking_app.service;

import com.example.banking_app.dto.AccountDto;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

}
