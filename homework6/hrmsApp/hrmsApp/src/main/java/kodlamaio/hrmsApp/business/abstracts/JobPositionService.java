package kodlamaio.hrmsApp.business.abstracts;

import java.util.List;

import kodlamaio.hrmsApp.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAllJobPositions();
	
	void saveData(JobPosition job);

}
