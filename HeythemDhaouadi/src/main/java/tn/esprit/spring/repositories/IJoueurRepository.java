package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Joueur;

@Repository
public interface IJoueurRepository extends CrudRepository<Joueur,Integer>{

}
