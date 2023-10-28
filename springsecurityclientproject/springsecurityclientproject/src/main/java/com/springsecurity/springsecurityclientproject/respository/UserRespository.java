package com.springsecurity.springsecurityclientproject.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.springsecurityclientproject.entity.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long>{

}
