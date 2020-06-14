package com.blacklivesmatter.cashbailbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blacklivesmatter.cashbailbackend.model.AppUser;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
	
	Optional<AppUser> findByUsername(String username);

	Optional<AppUser> findByEmail(String email);
}
