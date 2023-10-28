package com.springsecurity.springsecurityclientproject.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.springsecurityclientproject.verficationtoken.VerficationToken;

public interface VerficationTokenRepository extends JpaRepository<VerficationToken, Long>{

}
