package com.example.Registration.RegistrationServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Registration.REgistrationService.RegistrationBeenService;
import com.example.Registration.RegistrationBeen.RegistrationBeen;
import com.example.Registration.RegistrationRepository.RegistrationRepository;
@Service
@Transactional
public class RegistrationBeenServiceImpl implements RegistrationBeenService{
	@Autowired
   private RegistrationRepository registrationRepository;
	@Override
	public RegistrationBeen save(RegistrationBeen registrationBeen) {
	return registrationRepository.save(registrationBeen);
		
	}

	@Override
	public RegistrationBeen findbyid(String id) {
		// TODO Auto-generated method stub
		return registrationRepository.findById(id).get();
		 
	}

	@Override
	public List<RegistrationBeen> findAll() {
		// TODO Auto-generated method stub
		return 	registrationRepository.findAll();
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		registrationRepository.deleteById(id);
		
	}

}
