package com.example.Registration.REgistrationService;

import java.util.List;

import com.example.Registration.RegistrationBeen.RegistrationBeen;

public interface RegistrationBeenService {
	public RegistrationBeen  save(RegistrationBeen registrationBeen);
	public RegistrationBeen findbyid(String id);
	public List<RegistrationBeen> findAll();
	public void delete(String id);

}
