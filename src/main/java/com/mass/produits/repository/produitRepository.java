package com.mass.produits.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mass.produits.entities.Category;
import com.mass.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	List<Produit> findByNomProduit(String nom);
	List<Produit> findByNomProduitContains(String nom);
	@Query("select p from Produit p where p.nomProduit like %:nom and p.prixProduit > :prix")
	List<Produit> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);
	@Query("select p from Produit p where p.category = ?1")
	List<Produit> findByCategorie(Category category);
	List<Produit> findByCategoryIdCat(Long id);
	List<Produit> findByOrderByNomProduitAsc();
	@Query("select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC")
	List<Produit> trierProduitsNomsPrix();
	
}
