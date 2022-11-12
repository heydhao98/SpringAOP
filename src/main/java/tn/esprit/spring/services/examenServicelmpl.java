package tn.esprit.spring.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entities.Equipe;
import tn.esprit.spring.entities.Joueur;

import tn.esprit.spring.repositories.IEquipeRepository;
import tn.esprit.spring.repositories.IJoueurRepository;
import tn.esprit.spring.repositories.IMatchFootballRepository;

@Service
@Slf4j
public class examenServicelmpl implements IExamenService{
	@Autowired
	IEquipeRepository equipeRepository;
	@Autowired
	IJoueurRepository joueurRepository;
	@Autowired
	IMatchFootballRepository matchfootballRepository;
	
	@Override
	@Transactional
	public void ajouterEquipe(Equipe equipe){
		equipeRepository.save(equipe);
	}
	@Override
	@Transactional
	public void ajouterEtAffecterJoueurAEquipe(Joueur joueur, int idEquipe){
		Equipe f = equipeRepository.findById(idEquipe).orElse(null);
		
		joueur.setEquipes(f);
		joueurRepository.save(joueur);
	}
	
	
	

}
