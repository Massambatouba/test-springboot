package com.mass.produits;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mass.produits.entities.Category;
import com.mass.produits.entities.Produit;
import com.mass.produits.repository.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {
	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PC cable", 200, new Date());
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
	
	@Test
	public void testFindByNomProduit() {
		List<Produit> prods = produitRepository.findByNomProduit("PC motorola");
		for (Produit p : prods)
		 System.out.println(p);
	}
	@Test
	public void testFindByNomProduitContains() {
		List<Produit> prods = produitRepository.findByNomProduitContains("P");
		for(Produit p: prods)
			System.out.println(p);
			
	}
	@Test
	public void testfindByNomPrix() {
		List<Produit> prods = produitRepository.findByNomPrix("PC cable", 300.0);
		for(Produit p: prods)
			System.out.println(p);
	}
	@Test void testfindByCategorie() {
		Category cat = new Category();
		cat.setIdCat(1L);
		List<Produit> prods  = produitRepository.findByCategorie(cat);
		for(Produit p: prods)
			System.out.println(p);
		
	}
	@Test void testfindByCategoryIdCat() {
		List<Produit> prods = produitRepository.findByCategoryIdCat(1L);
		for(Produit p: prods)
			System.out.println(p);
	}
	
	@Test
	public void testfindByOrderByNomProduitAsc() {
		List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
		for(Produit p: prods)
			System.out.println(p);
	}
	
	@Test
	public void trierProduitNomPrix() {
		List<Produit> prods = produitRepository.trierProduitsNomsPrix();
		for(Produit p: prods)
			System.out.println(p);
	}
}
