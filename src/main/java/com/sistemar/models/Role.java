package com.sistemar.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority{

	@Id
	private String nomeRole;

	@ManyToMany(mappedBy = "roles")
    private List<Cliente> clientes;
	
	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}
	
	public List<Cliente> getUsuarios() {
		return clientes;
	}

	public void setUsuarios(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nomeRole;
	}
	
	
}
