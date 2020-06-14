package com.blacklivesmatter.cashbailbackend.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

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
	@NotBlank(message = "must include username")
	private String username;
	@NotBlank(message = "must include password")
	private String password;
	@NotBlank(message = "must include firstName")
	private String firstName;
	@NotBlank(message = "must include lastName")
	private String lastName;
	@NotBlank(message = "must include email address")
	@Email
	private String email;
	private boolean enabled;
	private Instant created;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
}
