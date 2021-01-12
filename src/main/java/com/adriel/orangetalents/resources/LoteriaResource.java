package com.adriel.orangetalents.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.adriel.orangetalents.domains.Loteria;
import com.adriel.orangetalents.domains.dto.LoteriaDTO;
import com.adriel.orangetalents.services.LoteriaService;

@RestController
@RequestMapping(value = "/loterias")
public class LoteriaResource {
	
	@Autowired
	private LoteriaService service;
	
	@GetMapping
	public ResponseEntity<List<Loteria>> find() {
		List<Loteria> loterias = service.findAll();
		return ResponseEntity.ok().body(loterias);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody LoteriaDTO obj){
		Loteria loteria = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(loteria.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}

	@GetMapping(value = "/pessoas")
	public ResponseEntity<List<Loteria>> findByEmail(@RequestParam(value = "email", defaultValue = "") String email){
		
		List<Loteria> loterias = service.findByEmail(email);
		return ResponseEntity.ok().body(loterias);
	}
}
