package kodlamaio.hrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsApp.business.abstracts.JobPositionService;
import kodlamaio.hrmsApp.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrmsApp.entities.concretes.JobPosition;

@Service  //bu class servis görevi görecek anlamına gelir.
public class JobPositionManager implements JobPositionService {
	private JobPositionDao jobPositionDao;
	
	@Autowired    //jobPositionDao'ya karşılık sınıf arar ve yönlendirmesini yapar.
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPosition> getAllJobPositions() {
		
		return this.jobPositionDao.findAll();
	}

	@Override
	public void saveData(JobPosition job) {
		
		this.jobPositionDao.save(job);
		
	}
	
	
	
	

}













