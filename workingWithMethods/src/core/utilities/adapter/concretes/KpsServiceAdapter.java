package core.utilities.adapter.concretes;

import core.utilities.adapter.abstracts.PersonService;
import entities.abstracts.Person;

public class KpsServiceAdapter implements PersonService {

	@Override
	public boolean checkPerson(Person person) {
		KpsService kpsService = new KpsService();
		return kpsService.checkPerson(person.getIdentityNumber(), person.getFirstName(), person.getLastName(),
				person.getYearOfBirth());
	}

}
