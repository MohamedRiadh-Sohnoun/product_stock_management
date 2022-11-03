package com.springproject.gestionProduit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springproject.gestionProduit.entities.Produit;
import com.springproject.gestionProduit.service.ServiceCategorie;
import com.springproject.gestionProduit.service.ServiceProduit;


@Controller
@RequestMapping("/apiproduit")
public class ProduitControleur {
	@Autowired
	ServiceProduit sp;
	@Autowired
	ServiceCategorie sc;
	
	@GetMapping("/all")
	public String getAllProduits(Model m) {
		
		List<Produit> liste = sp.getAllProducts();
		m.addAttribute("liste", liste);
		return "produits";
	}
	
	@GetMapping("/produitmc")
	public String getProduitPMC(@RequestParam String mc, Model m) {
		List<Produit> liste = sp.getProductsBMC(mc);
		m.addAttribute("liste", liste);
		return "produits";
	}
	
	@GetMapping("/supprimerproduit/{id}")
	public String supprimerProduit(@PathVariable int id) {
		sp.supprimerProduit(id);
		return "redirect:/apiproduit/all";
	}
	
	@GetMapping("/ajouterproduit")
	public String ajouterProduit(Model m) {
		m.addAttribute("categories", sc.getAllCategories());
		return "ajouterproduit";
	}
	
	@PostMapping("/saveproduit")
	public String sauvegarderProduit(@ModelAttribute Produit p) {
		sp.saveProduit(p);
		return "redirect:/apiproduit/all";
	}
	
	@GetMapping("/modifierproduit/{id}")
	public String modifierProduit(Model m, @PathVariable int id ) {
		m.addAttribute("categories", sc.getAllCategories());
		m.addAttribute("produit", sp.getProduct(id));
		
		return "ajouterproduit";
	}
}















