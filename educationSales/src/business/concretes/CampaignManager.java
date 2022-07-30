package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import entities.concretes.Education;

public class CampaignManager implements CampaignService {

	@Override
	public void updatePriceFromDatabase(List<Education> educations) {

		for (Education education : educations) {
			education.setUnitPrice(updatePrice());
		}

	}

	private double updatePrice() {

		// veri tabanına bağlan oradan cek
		return 25;
	}

}
