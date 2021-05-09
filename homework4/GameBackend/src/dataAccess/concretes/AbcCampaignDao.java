package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class AbcCampaignDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getId() 
				+ " numarali kampanya eklenmistir.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId() 
				+ " numarali kampanya guncellenmistir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getId() 
				+ " numarali kampanya silinmistir.");
		
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
