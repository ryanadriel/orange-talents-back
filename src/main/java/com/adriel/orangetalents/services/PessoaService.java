package com.adriel.orangetalents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adriel.orangetalents.domains.Pessoa;
import com.adriel.orangetalents.repositories.PessoaRepository;

@Service
public class PessoaService {

	// Repositories
	@Autowired
	private PessoaRepository repo;
	
	public List<Pessoa> findAll(){
		
		return repo.findAll();
	}
}
