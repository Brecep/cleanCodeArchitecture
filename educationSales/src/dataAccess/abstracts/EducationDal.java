package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Education;

public interface EducationDal {
	List<Education> getAll();
}
