package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "schema_banque._t_r_typeoperation_top")
public class TypeOperationEntity {

	@Id
	private int top_id;
	
	private String top_libelle;
	
	public TypeOperationEntity() {
		
	}

	public TypeOperationEntity(int top_id, String top_libelle) {
		this.top_id = top_id;
		this.top_libelle = top_libelle;
	}

	public int getTop_id() {
		return top_id;
	}

	public void setTop_id(int top_id) {
		this.top_id = top_id;
	}

	public String getTop_libelle() {
		return top_libelle;
	}

	public void setTop_libelle(String top_libelle) {
		this.top_libelle = top_libelle;
	}

	
	
}
