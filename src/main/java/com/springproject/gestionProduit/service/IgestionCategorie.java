package com.springproject.gestionProduit.service;

import java.util.List;
import com.springproject.gestionProduit.entities.Categorie;

public interface IgestionCategorie {
	public void addCategorie(Categorie c);
	public List<Categorie> getAllCategories();
	public Categorie getCategorie(int id);
	public void deleteCategorie(int id);
	
}
