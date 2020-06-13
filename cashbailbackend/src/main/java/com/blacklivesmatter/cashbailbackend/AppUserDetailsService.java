package com.blacklivesmatter.cashbailbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blacklivesmatter.cashbailbackend.model.AppUser;
import com.blacklivesmatter.cashbailbackend.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser appUser = this.userRepo.findByUsername(username);
		
		if(appUser == null) {
			log.info("User not found: {}", username);
			throw new UsernameNotFoundException("User not found");
		}
		
		return User
				.withUsername(username)
				.password(appUser.getPassword())
				.roles(appUser.getRole().toString())
				.build();
	}

}
