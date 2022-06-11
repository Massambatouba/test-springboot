package com.mass.produits.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String nomCat;
	private String descriptionCat;
	
	@OneToMany (mappedBy = "category")
	@JsonIgnore
	private List<Produit> produits;
	public Long getIdCat() {
		return idCat;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public String getDescriptionCat() {
		return descriptionCat;
	}
	public void setDescriptionCat(String descriptionCat) {
		this.descriptionCat = descriptionCat;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String nomCat, String descriptionCat) {
		super();
		this.nomCat = nomCat;
		this.descriptionCat = descriptionCat;
	}
	@Override
	public String toString() {
		return "Category [idCat=" + idCat + ", nomCat=" + nomCat + ", descriptionCat=" + descriptionCat + "]";
	}
	

}
