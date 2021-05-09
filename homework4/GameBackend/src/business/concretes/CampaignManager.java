package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	private CampaignDao _campaignDao;
	
	public CampaignManager(CampaignDao _campaignDao) {
		super();
		this._campaignDao = _campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		_campaignDao.add(campaign);
	}

	@Override
	public void update(Campaign campaign) {
		_campaignDao.update(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		_campaignDao.delete(campaign);
		
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
