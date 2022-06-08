package com.capgemini.backendAngular;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person, Integer> {
// dialogar contra el motor de MySQL
// CRUD ... CREATE. READ. UPDATE. DELETE --> ABMC
	List<Person> findAll(); // hago overriding del findAll de Repository
	Person findById(int id);
	Person save(Person p);
	void delete(Person p);	
}
