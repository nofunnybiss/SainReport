package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PersonBag {

		final HashMap<Integer, Person> people = new HashMap<Integer, Person>();

		// Two ways of adding people to the HashMap
		public void addPerson(Person p){
			people.put(p.getId(), p);
		}
		public void addPerson(String name, int id, String username,
				String password, String address) {

			people.put(id, new Person(name, id, username,
				 password, address));
		}

		public void removePerson(Person p){
			people.remove(p);
		}

		public Person searchForPerson(String username, String password) {
			Iterator entry = people.entrySet().iterator();
		    while (entry.hasNext()) {
		        Map.Entry pair = (Map.Entry)entry.next();
		        Person p = (Person)pair.getValue();
		        if(p.getUsername().equals(username) && p.getPassword().equals(password)) {
		        	return p;
		        }
		    }
			return null;
		}

		public Person searchById(int id) {
			return people.get(id);
		}
}