package com.idrissirajaa.ebankingbackend.repositories;

import com.benabdesselam.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
