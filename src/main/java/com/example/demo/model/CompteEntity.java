package com.example.demo.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "schema_banque.t_compte_cpt")
public class CompteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cpt_id;

	private double cpt_solde;
	private double cpt_maxDecouvert;
	private double cpt_tauxEpargne;
	
	@ManyToOne
	private TypeCompteEntity cpt_typeCompte;
	
	@OneToMany(mappedBy = "opr_id")
	private List<OperationEntity> cpt_listOperation;
	
	public CompteEntity() {
		
	}

	public CompteEntity(int cpt_id, double cpt_solde, double cpt_maxDecouvert, double cpt_tauxEpargne) {
		super();
		this.cpt_id = cpt_id;
		this.cpt_solde = cpt_solde;
		this.cpt_maxDecouvert = cpt_maxDecouvert;
		this.cpt_tauxEpargne = cpt_tauxEpargne;
	}

	public int getCpt_id() {
		return cpt_id;
	}

	public void setCpt_id(int cpt_id) {
		this.cpt_id = cpt_id;
	}

	public double getCpt_solde() {
		return cpt_solde;
	}

	public void setCpt_solde(float cpt_solde) {
		this.cpt_solde = cpt_solde;
	}

	public double getCpt_maxDecouvert() {
		return cpt_maxDecouvert;
	}

	public void setCpt_maxDecouvert(float cpt_maxDecouvert) {
		this.cpt_maxDecouvert = cpt_maxDecouvert;
	}

	public double getCpt_tauxEpargne() {
		return cpt_tauxEpargne;
	}

	public void setCpt_tauxEpargne(float cpt_tauxEpargne) {
		this.cpt_tauxEpargne = cpt_tauxEpargne;
	}
	
	
}
