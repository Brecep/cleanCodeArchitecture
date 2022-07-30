package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import entities.concretes.Education;

public class PercentileCampaignManager implements CampaignService {

	@Override
	public void updatePriceFromDatabase(List<Education> educations) {

		for (Education education : educations) {
			education.setUnitPrice(education.getUnitPrice() - (education.getUnitPrice() * updatePrice()));
		}
	}

	private double updatePrice() {

		return 0.25;
	}
}
