package api;

import business.abstracts.EducationService;
import business.concretes.EducationManager;
import business.concretes.PercentileCampaignManager;
import dataAccess.concretes.HibernateEducationDal;

public class Main {

	public static void main(String[] args) {
		EducationService educationService = new EducationManager(new HibernateEducationDal(),
				new PercentileCampaignManager());
		
		
		for (var item : educationService.getAll()) {
			System.out.println("Egitim adi : " + item.getName() + "\n" + "Egitim fiyati : " + item.getUnitPrice()
					+ "\n------------------------");
		}

	}

}
