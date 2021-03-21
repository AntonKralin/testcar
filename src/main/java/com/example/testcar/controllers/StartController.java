package com.example.testcar.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testcar.repositoy.BrandRepository;
import com.example.testcar.repositoy.UsersRepository;
import com.example.testcar.entity.Brand;
import com.example.testcar.entity.Users;

@RestController
@RequestMapping("cars")
public class StartController {

	@Autowired
	UsersRepository userRepository;
	@Autowired
	BrandRepository brandRepository;
	
	@GetMapping("/")
	public Iterable<Users> start() {
		return userRepository.findAll();
	}
	
	@GetMapping("/brand/{id}")
	public Brand getBrand(@PathVariable String id) {
		Optional<Brand> brand = brandRepository.findById(Integer.valueOf(id));
		return brand.get();
	}
	
	@GetMapping("/brandlist")
	public Iterable<Brand> getBrandList(){
		return brandRepository.findAll();
	}
	
}
