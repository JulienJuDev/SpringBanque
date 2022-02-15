package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schema_banque._t_r_typecompte_tcp")
public class TypeCompteEntity {

	@Id
	private int tcp_id;
	
	private String tcp_libelle;
	
	public TypeCompteEntity() {
		
	}

	public TypeCompteEntity(int top_id, String top_libelle) {
		this.tcp_id = top_id;
		this.tcp_libelle = top_libelle;
	}

	public int getTop_id() {
		return tcp_id;
	}

	public void setTop_id(int top_id) {
		this.tcp_id = top_id;
	}

	public String getTop_libelle() {
		return tcp_libelle;
	}

	public void setTop_libelle(String top_libelle) {
		this.tcp_libelle = top_libelle;
	}

	
	
}