package com.springproject.gestionProduit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springproject.gestionProduit.entities.Produit;
import java.util.List;


public interface ProduitRepository extends JpaRepository<Produit, Integer> {

	//Premiere Facon:
	//List<Produit> findByNomContains(String mc);
	
	//Deuxieme Facon:
	@Query("select p from Produit p where p.nom like %:x%")
	List<Produit> rechercherParNom(@Param("x") String mc);
	
}
