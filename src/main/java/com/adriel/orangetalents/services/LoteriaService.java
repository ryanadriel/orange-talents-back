package com.adriel.orangetalents.services;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriel.orangetalents.domains.Loteria;
import com.adriel.orangetalents.domains.Pessoa;
import com.adriel.orangetalents.domains.dto.LoteriaDTO;
import com.adriel.orangetalents.repositories.LoteriaRepository;
import com.adriel.orangetalents.repositories.PessoaRepository;

@Service
public class LoteriaService {
	
	//Repositories
	@Autowired
	private LoteriaRepository repo;
	@Autowired
	private PessoaRepository pessoaRepo;
	
	public List<Loteria> findAll(){
		
		return repo.findAll();
	}
	
	public List<Loteria> findByEmail(String email){
		if(email != null) {
			return repo.findByEmail(email);
		}
		return null;
	}
	
	public Loteria insert(LoteriaDTO obj) {
		Pessoa pessoa = pessoaRepo.findByEmail(obj.getEmail());
		Loteria loteria;
		System.out.println(obj.getEmail());
		
		if(pessoa != null) {
			System.out.println("Entrei");
			loteria = new Loteria(null, this.generatedSequence().toString(), pessoa);
			pessoa.getLoterias().add(loteria);
		}else {
			pessoa = new Pessoa(null, obj.getEmail());
			loteria = new Loteria(null, this.generatedSequence().toString(), pessoa);
			pessoa.setLoterias(Arrays.asList(loteria));
		}
		pessoaRepo.saveAll(Arrays.asList(pessoa));
		return repo.save(loteria);
		
	} 
	
	public Integer generatedSequence() {
		Random code = new Random();
		return code.nextInt(1000000 - 1);
	}

}
