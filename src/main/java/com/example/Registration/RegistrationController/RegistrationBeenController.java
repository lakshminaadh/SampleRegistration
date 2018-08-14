package com.example.Registration.RegistrationController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Registration.REgistrationService.RegistrationBeenService;
import com.example.Registration.RegistrationBeen.RegistrationBeen;

@RestController
@RequestMapping("/api")
public class RegistrationBeenController {
	
	@Autowired
	private RegistrationBeenService registrationBeenService;
	
	@PostMapping("/save")
public ResponseEntity<RegistrationBeen> save(@RequestBody RegistrationBeen registrationBeen){
		RegistrationBeen savedRegestr=	registrationBeenService.save(registrationBeen);
	return new ResponseEntity<>(savedRegestr,HttpStatus.OK);
		
	}
	@DeleteMapping("/DeleteById/{id}")
	public ResponseEntity<String> delete(@PathVariable("id" ) String id){
		registrationBeenService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	@GetMapping("/findallRegisterdusers")
	public ResponseEntity<List<RegistrationBeen>> findall(){
		List<RegistrationBeen> allUsers=	registrationBeenService.findAll();
		return new ResponseEntity<>(allUsers,HttpStatus.OK);
		
	}
	@GetMapping("/findbyid/{id}")
	public ResponseEntity<RegistrationBeen> finduserbyid(@PathVariable String id){
		RegistrationBeen findById=	registrationBeenService.findbyid(id);
		return new ResponseEntity<>(findById,HttpStatus.OK);
		
	}
}
