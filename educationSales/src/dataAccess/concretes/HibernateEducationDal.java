package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.EducationDal;
import entities.concretes.Education;

public class HibernateEducationDal implements EducationDal {
	private List<Education> educations;

	@Override
	public List<Education> getAll() {
		educations = new ArrayList<>();
		educations.add(new Education(1, "C# Course", 1299.99));
		educations.add(new Education(2, "Pyhton Course", 1999.99));
		System.out.println("Hibernate ile listeleme yapildi !\n");
		return educations;

	}

}
