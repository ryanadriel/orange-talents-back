package com.adriel.orangetalents.services.instantiates;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriel.orangetalents.domains.Loteria;
import com.adriel.orangetalents.domains.Pessoa;
import com.adriel.orangetalents.repositories.LoteriaRepository;
import com.adriel.orangetalents.repositories.PessoaRepository;

@Service
public class DevInstantiate {
	//Repositories
	@Autowired
	private PessoaRepository repo;
	@Autowired
	private LoteriaRepository loteriaRepo;
	

	public void instantiate() {
		Pessoa p1 = new Pessoa(null, "adriel@hotmail.com");
		Loteria l1 = new Loteria(null, "123456", p1);
		p1.setLoterias(Arrays.asList(l1));
		
		repo.saveAll(Arrays.asList(p1));
		loteriaRepo.saveAll(Arrays.asList(l1));
	}

}

