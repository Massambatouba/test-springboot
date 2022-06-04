package com.mass.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mass.produits.entities.Produit;
import com.mass.produits.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {
	
	@Autowired
     ProduitRepository produitRepository;

	@Override
	public Produit saveProduit(Produit p) {
		
		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
		
	}

	@Override
	public Produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduit() {
		
		return produitRepository.findAll();
	}


} 
