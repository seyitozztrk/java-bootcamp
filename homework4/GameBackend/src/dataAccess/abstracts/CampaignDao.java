package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Campaign;

public interface CampaignDao {
	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);

	List<Campaign> getAll();

}
