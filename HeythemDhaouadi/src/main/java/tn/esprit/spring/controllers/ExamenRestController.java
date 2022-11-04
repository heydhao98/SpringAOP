package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Equipe;
import tn.esprit.spring.entities.Joueur;
import tn.esprit.spring.services.IExamenService;

@RestController
@RequestMapping("/test")
public class ExamenRestController {
	@Autowired
	IExamenService examenService;
	
	@PostMapping("/addEquipe")
	@ResponseBody
	public void addEquipe(@RequestBody Equipe equipe){
		examenService.ajouterEquipe(equipe);
	}
	
	@PostMapping("/addAffectJoueur/{idEquipe}")
	@ResponseBody
	public void addEquipe(@RequestBody Joueur Joueur,  @PathVariable("idEquipe") int idEquipe){
		examenService.ajouterEtAffecterJoueurAEquipe(Joueur, idEquipe);
	}
	
	

}
