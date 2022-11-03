package com.springproject.gestionProduit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.gestionProduit.dao.CategorieRepository;
import com.springproject.gestionProduit.entities.Categorie;

@Service
public class ServiceCategorie implements IgestionCategorie {

	private CategorieRepository cr;
	
	public ServiceCategorie(CategorieRepository cr) {
		this.cr = cr;
	}
	
	@Override
	public void addCategorie(Categorie c) {
		cr.save(c);
	}

	@Override
	public List<Categorie> getAllCategories() {
		return cr.findAll();
	}

	@Override
	public Categorie getCategorie(int id) {
		return cr.findById(id).get();
	}

	@Override
	public void deleteCategorie(int id) {
		cr.deleteById(id);
	}

}
