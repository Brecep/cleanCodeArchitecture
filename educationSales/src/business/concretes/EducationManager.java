package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.CampaignService;
import business.abstracts.EducationService;
import dataAccess.abstracts.EducationDal;
import entities.concretes.Education;

public class EducationManager implements EducationService {
	private EducationDal educationDal;
	private CampaignService campaignService;

	public EducationManager(EducationDal educationDalal, CampaignService campaignService) {
		super();
		this.educationDal = educationDalal;
		this.campaignService = campaignService;
	}

	@Override
	public List<Education> getAll() {
		List<Education> educationsDaoList = educationDal.getAll();
		this.campaignService.updatePriceFromDatabase(educationsDaoList);
		return educationsDaoList;
	}


}
