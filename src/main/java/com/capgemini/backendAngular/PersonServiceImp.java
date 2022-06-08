package com.capgemini.backendAngular;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService {

	@Autowired
	private PersonRepository repository;
	
	@Override
	public List<Person> list() {		
		return repository.findAll();
	}

	@Override
	public Person listId(int id) {
		return repository.findById(id);
	}

	@Override
	public Person edit(Person p) {
		return repository.save(p);
	}

	@Override
	public Person add(Person p) {
		return repository.save(p);
	}

	@Override
	public void delete(int id) {
	Person p=repository.findById(id);
	if(p!=null) {
		repository.delete(p);
	}

	}

}
