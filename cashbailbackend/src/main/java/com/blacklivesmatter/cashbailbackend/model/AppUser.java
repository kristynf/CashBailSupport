package com.blacklivesmatter.cashbailbackend.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.blacklivesmatter.cashbailbackend.enums.Role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AppUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String username;
	
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
}
