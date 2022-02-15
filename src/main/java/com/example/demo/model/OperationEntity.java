package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schema_banque.t_operation_opr")
public class OperationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int opr_id;

	private double opr_montant;
	private Date opr_date;
	
	@ManyToOne
	private TypeCompteEntity opr_typeCompte;
	
	@ManyToOne
	private CompteEntity opr_compte;
	
	public OperationEntity() {
		
	}

	public OperationEntity(int opr_id, double opr_montant, Date opr_date, TypeCompteEntity opr_typeCompte,
			CompteEntity opr_compte) {
		this.opr_id = opr_id;
		this.opr_montant = opr_montant;
		this.opr_date = opr_date;
		this.opr_typeCompte = opr_typeCompte;
		this.opr_compte = opr_compte;
	}

	public int getOpr_id() {
		return opr_id;
	}

	public void setOpr_id(int opr_id) {
		this.opr_id = opr_id;
	}

	public double getOpr_montant() {
		return opr_montant;
	}

	public void setOpr_montant(double opr_montant) {
		this.opr_montant = opr_montant;
	}

	public Date getOpr_date() {
		return opr_date;
	}

	public void setOpr_date(Date opr_date) {
		this.opr_date = opr_date;
	}

	public TypeCompteEntity getOpr_typeCompte() {
		return opr_typeCompte;
	}

	public void setOpr_typeCompte(TypeCompteEntity opr_typeCompte) {
		this.opr_typeCompte = opr_typeCompte;
	}

	public CompteEntity getOpr_compte() {
		return opr_compte;
	}

	public void setOpr_compte(CompteEntity opr_compte) {
		this.opr_compte = opr_compte;
	}
	
	
	
}
