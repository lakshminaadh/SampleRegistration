package com.example.Registration.RegistrationBeen;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="sequence")
public class RegistrationBeen {
	
	
	@Id
	private String id;
	@NotEmpty(message="fistNAme must not be empty")
	private String fistName;
	@NotEmpty(message="lastNAme must not be empty")
	private String lastNAme;
	
	@NotEmpty(message="email must not be empty")
	@Email(message="email email should be a valid mail")
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastNAme() {
		return lastNAme;
	}

	public void setLastNAme(String lastNAme) {
		this.lastNAme = lastNAme;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
