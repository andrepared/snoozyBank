package com.snoozyBank.accounts.service.impl;

import com.snoozyBank.accounts.dto.CustomerDto;
import com.snoozyBank.accounts.repository.AccountsRepository;
import com.snoozyBank.accounts.repository.CustomerRepository;
import com.snoozyBank.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

private AccountsRepository accountsRepository;
private CustomerRepository customerRepository;

    /**
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
