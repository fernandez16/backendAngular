package com.capgemini.backendAngular;

import java.util.List;

public interface PersonService {
	 List<Person> list();
	 Person listId(int id);
	 Person add(Person p);
	 Person edit(Person p);
	 void delete(int id);
}
