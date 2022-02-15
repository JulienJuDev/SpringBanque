package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CompteEntity;
import com.example.demo.repository.ICompteRepository;
import com.example.demo.service.interfaces.ICompteEntityService;

@Service
public class CompteEntityServiceImpl implements ICompteEntityService {

	@Autowired ICompteRepository compteRepository;

	@Override
	public CompteEntity getCompte(int id) {
		
		return compteRepository.getById(id);
	}
	
}
