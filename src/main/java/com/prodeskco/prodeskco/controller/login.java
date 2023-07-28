package com.prodeskco.prodeskco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodeskco.prodeskco.repo.IUserRepo;

@RestController
public class login {
	
	@Autowired 
	private IUserRepo Repo;
	
    @GetMapping("/login")
    public String prueba() {
        return "Esto es una prueba Juan David";
    }
}