package com.adriel.orangetalents.domains.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class LoteriaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//Atributos
	private Integer id;
	@Email(message = "email inválido")
	@NotEmpty(message = "o campo email não pode ser vazio")
	private String email;
	private String codigo;
	
	//Construtores
	public LoteriaDTO() {
		
	}

	public LoteriaDTO(Integer id, String email, String codigo) {
		this.id = id;
		this.email = email;
		this.codigo = codigo;
	}

	//Getters e Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	//HashCode e Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoteriaDTO other = (LoteriaDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
