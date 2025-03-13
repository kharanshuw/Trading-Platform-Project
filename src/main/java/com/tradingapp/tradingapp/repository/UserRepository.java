package com.tradingapp.tradingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tradingapp.tradingapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
