package com.adriel.orangetalents.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.adriel.orangetalents.domains.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	
	@Transactional(readOnly = true)
	Pessoa findByEmail(String email);
}
