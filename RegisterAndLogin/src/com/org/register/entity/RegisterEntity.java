package com.org.register.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import lombok.Data;


@Entity
@Table(name="register")
@Data
public class RegisterEntity implements Serializable {
	
	
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column(name="id")
	private int id;
	@Column(name="userName")
	private String userName;
	@Column(name="email")
	private String email;
	@Column(name="phnNum")
	private float phnNum;
	@Column(name="password")
	private String password;
	@Column(name="confirmPass")
	private String confirmPassword;
	
	public RegisterEntity() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}


}
