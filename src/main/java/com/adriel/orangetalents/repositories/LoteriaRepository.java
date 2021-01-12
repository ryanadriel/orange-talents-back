package com.adriel.orangetalents.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.adriel.orangetalents.domains.Loteria;

public interface LoteriaRepository extends JpaRepository<Loteria, Integer>{

	@Transactional(readOnly = true)
	@Query(value = "SELECT DISTINCT obj FROM Loteria obj INNER JOIN obj.pessoa pes WHERE pes.email LIKE %:email% ")
	List<Loteria> findByEmail(String email);
	
}
