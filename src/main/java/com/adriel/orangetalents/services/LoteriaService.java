package com.adriel.orangetalents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriel.orangetalents.domains.Loteria;
import com.adriel.orangetalents.repositories.LoteriaRepository;

@Service
public class LoteriaService {
	
	//Repositories
	@Autowired
	private LoteriaRepository repo;
	
	public List<Loteria> findAll(){
		
		return repo.findAll();
	}

}
