package com.springproject.gestionProduit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.gestionProduit.dao.ProduitRepository;
import com.springproject.gestionProduit.entities.Produit;
import com.springproject.gestionProduit.entities.Categorie;

@Service
public class ServiceProduit implements IgestionProduit {

	@Autowired
	ProduitRepository pr;
	
	@Override
	public void saveProduit(Produit p) {
		pr.save(p);

	}

	@Override
	public List<Produit> getAllProducts() {
		return pr.findAll();
	}

	@Override
	public Produit getProduct(int id) {
		return pr.findById(id).get();
	}

	@Override
	public List<Produit> getProductsBMC(String mc) {
		return pr.rechercherParNom(mc);
	}

	@Override
	public void supprimerProduit(int id) {

		pr.deleteById(id);
	}

	@Override
	public void mettreAJourProduit(Produit p) {
		pr.save(p);
		
	}

		
		

}
