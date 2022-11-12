package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.MatchFootball;

@Repository
public interface IMatchFootballRepository extends CrudRepository<MatchFootball,Integer>{
	

}
