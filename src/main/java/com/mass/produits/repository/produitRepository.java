package com.mass.produits.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mass.produits.entities.Produit;

public interface produitRepository extends JpaRepository<Produit, Long> {

}
