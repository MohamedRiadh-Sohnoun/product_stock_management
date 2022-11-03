package com.springproject.gestionProduit.service;

import java.util.List;
import com.springproject.gestionProduit.entities.Produit;
import com.springproject.gestionProduit.entities.Categorie;

public interface IgestionProduit {
	
	void saveProduit(Produit p);
	List<Produit> getAllProducts();
	Produit getProduct(int id);
	List<Produit> getProductsBMC(String mc);
	void supprimerProduit(int id);
	void mettreAJourProduit(Produit p);

	
}
