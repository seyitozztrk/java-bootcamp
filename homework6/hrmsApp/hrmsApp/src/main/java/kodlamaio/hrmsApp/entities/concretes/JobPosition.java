package kodlamaio.hrmsApp.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="job_positions")
@Data
public class JobPosition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//birer birer artması için ! 
	
	private int id;
	
	@Column(name="position")
	private String position;
	
	public JobPosition() { }

	public JobPosition(String position) {
		super();
		//this.id = id;
		this.position = position;
	}
	
	

}
