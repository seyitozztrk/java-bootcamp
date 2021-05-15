package kodlamaio.hrmsApp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsApp.entities.concretes.JobPosition;


//@see CrudRepository
//@param <T> the domain type the repository manages
//@param <ID> the type of the id of the entity the repository manages
//JpaRepository <T,ID>

//interface interface'i extends eder!                 entity,primarykey     
public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
