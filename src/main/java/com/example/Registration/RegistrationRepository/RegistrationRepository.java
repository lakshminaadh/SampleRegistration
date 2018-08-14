package com.example.Registration.RegistrationRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Registration.RegistrationBeen.RegistrationBeen;

public interface RegistrationRepository  extends MongoRepository<RegistrationBeen, String>{

}
