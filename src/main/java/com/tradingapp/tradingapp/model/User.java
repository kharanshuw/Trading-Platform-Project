package com.tradingapp.tradingapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.tradingapp.tradingapp.domain.USER_ROLE;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fullname;

	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;

	private USER_ROLE role = USER_ROLE.ROLE_CUSTOMER;
	
	@Embedded
	private TwoFactorAuth twoFactorAuth = new TwoFactorAuth();
	
	
}
