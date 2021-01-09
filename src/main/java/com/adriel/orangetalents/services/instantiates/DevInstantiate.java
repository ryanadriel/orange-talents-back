package com.adriel.orangetalents.services.instantiates;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriel.orangetalents.domains.Pessoa;
import com.adriel.orangetalents.repositories.PessoaRepository;

@Service
public class DevInstantiate {
	//Repositories
	@Autowired
	private PessoaRepository repo;
	

	public void instantiate() {
		Pessoa p1 = new Pessoa(null, "adriel@hotmail.com");
		
		repo.saveAll(Arrays.asList(p1));
	}

}
