package com.muramasa.simple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muramasa.simple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


	
}
