package com.spring.springsecurity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springsecurity.model.Subscriber;

@Repository
public interface SubscriberRepo extends JpaRepository<Subscriber,Long> {

    List<Subscriber> findByEmail(String email);
}
