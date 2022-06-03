package com.mass.produits;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mass.produits.entities.Produit;
import com.mass.produits.repository.produitRepository;

@SpringBootTest
class ProduitsApplicationTests {
	@Autowired
	private produitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PC motorola", 2200, new Date());
		//Produit prod = new Produit("PC", 2200, new Date());
		produitRepository.save(prod);
	}
	@Test
	public void testFindProduit() {
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);
	}
	@Test
	public void testUpdateProduit() {
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(1000.0);
		produitRepository.save(p);
		System.out.println(p);
	}
	@Test
	public void testDeleteProduit() {
	 produitRepository.deleteById(1L);
	}
	@Test
	public void testGetProduit() {
		List<Produit> prods = produitRepository.findAll();
		for (Produit p : prods) 
			System.out.println(p);
		
	}
	
	
	

}
