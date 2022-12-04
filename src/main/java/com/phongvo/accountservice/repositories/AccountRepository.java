package com.phongvo.accountservice.repositories;


import com.phongvo.accountservice.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountName(String accountName);

    Account findByAccountUserName(String accountUserName);
}
