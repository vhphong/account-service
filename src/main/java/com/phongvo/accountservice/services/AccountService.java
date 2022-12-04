package com.phongvo.accountservice.services;


import com.phongvo.accountservice.models.Account;
import com.phongvo.accountservice.models.Role;

import java.util.List;

public interface AccountService {
    Account saveAccount(Account account);

    Role saveRole(Role role);

    void addRoleToAccount(String userName, String roleName);

    Account getAccount(String accountName);

    List<Account> getAccounts();

}
