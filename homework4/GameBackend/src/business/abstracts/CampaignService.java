package business.abstracts;

import java.util.List;

import entities.concretes.Campaign;

public interface CampaignService {
	
	void add(Campaign game);
	void update(Campaign game);
	void delete(Campaign game);

	List<Campaign> getAll();

}
