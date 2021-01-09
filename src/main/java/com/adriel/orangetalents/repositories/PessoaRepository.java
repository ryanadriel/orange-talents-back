package com.adriel.orangetalents.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriel.orangetalents.domains.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
