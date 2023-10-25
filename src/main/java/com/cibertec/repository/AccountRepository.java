package com.cibertec.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cibertec.entity.Account;

public interface AccountRepository extends MongoRepository<Account, Integer>{

}
