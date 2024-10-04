package com.snoozyBank.accounts.service.impl;

import com.snoozyBank.accounts.constants.AccountsConstants;
import com.snoozyBank.accounts.dto.CustomerDto;
import com.snoozyBank.accounts.entity.Accounts;
import com.snoozyBank.accounts.entity.Customer;
import com.snoozyBank.accounts.mapper.CustomerMapper;
import com.snoozyBank.accounts.repository.AccountsRepository;
import com.snoozyBank.accounts.repository.CustomerRepository;
import com.snoozyBank.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

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
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        customerRepository.save(customer);
        accountsRepository.save(createNewAccount(customer));
    }

    private Accounts createNewAccount(Customer customer)
    {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;

    }
}
