package com.org.register.service;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.register.dao.RegisterDAO;
import com.org.register.dto.RegisterDTO;
import com.org.register.entity.RegisterEntity;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private RegisterDAO dao;
	
	public RegisterServiceImpl() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}

	
	public boolean ValidateAndSave(RegisterDTO dto) {
		boolean valid = true;
		try {
			System.out.println("save invoked ....");
			/*
			 * if (Objects.nonNull(DTO)) { System.out.println("starting validation for " +
			 * DTO); String Username = DTO.getUsername();
			 * 
			 * if (Username != null && !Username.isEmpty() && Username.length() >= 5) {
			 * System.out.println("Username is valid"); valid = true; } else {
			 * System.out.println("Username is invalid"); if (Username == null) {
			 * System.out.println("Username is null"); } if (Username != null &&
			 * Username.length() < 5) { System.out.println("name length is less than 5"); }
			 * valid = false; }
			 * 
			 * String Email = DTO.getEmail();
			 * 
			 * if (Email != null && !Email.isEmpty() && Email.length() >= 5) {
			 * System.out.println("Email is valid"); valid = true; } else { if (valid) {
			 * System.out.println("Email is invalid"); valid = false;
			 * 
			 * } }
			 * 
			 * String Password = DTO.getPassword();
			 * 
			 * if (Password != null && !Password.isEmpty() && Password.length() >= 5) {
			 * System.out.println("Password is valid"); valid = true; } else {
			 * 
			 * if (valid) { System.out.println("Password is invalid"); valid = false;
			 * 
			 * } }
			 * 
			 * String ConfirmPassword = DTO.getConfirmPassword(); if (ConfirmPassword !=
			 * null && !ConfirmPassword.isEmpty() && ConfirmPassword.length() >= 5) {
			 * System.out.println("ConfirmPassword is valid"); valid = true; } else { if
			 * (valid) { System.out.println("ConfirmPassword is invalid"); valid = false; }
			 * } }
			 */
			if (valid) {
				System.out.println("Data is valid ,will convert  to entity");

				RegisterEntity regEntity = new RegisterEntity();

				BeanUtils.copyProperties(dto, regEntity);

				System.out.println("entity is ready \t " + regEntity);
				dao.save(regEntity);
			} else {
				System.out.println("DATA NOT VALID ,NOT SAVED IN DATABASE");
			}

			return valid;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


}
