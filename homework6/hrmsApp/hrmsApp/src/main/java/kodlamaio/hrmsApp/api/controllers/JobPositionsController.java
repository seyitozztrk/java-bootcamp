package kodlamaio.hrmsApp.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsApp.business.abstracts.JobPositionService;
import kodlamaio.hrmsApp.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {
	private JobPositionService jobPositionService;
	
	@Autowired   //burada biz new ile değer göndermiyoruz.  ProductService'i implement eden sınıfları buraya yönlendirir.
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	
	@GetMapping("/getAllItems")
	public List<JobPosition> getAllJobs() {
		
		return this.jobPositionService.getAllJobPositions();
	}
	
	@GetMapping("/bulkcreate")
	public String bulkCreateA() {
		
		this.jobPositionService.saveData(new JobPosition("architecture"));
		return "job position was added!!!";
		
	}
	
	
	
	
	
	
	
	
}






























