package com.prodeskco.prodeskco.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class user implements Serializable{
	
	private @Id int id; // will be set when persisting
    private String email;
    private String password	;
    private int business;
    
    public user(String email, String password, int business) {
        this.email = email;
        this.password = password;
        this.business = business;
    }
}
