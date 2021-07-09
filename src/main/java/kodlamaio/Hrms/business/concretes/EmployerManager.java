package kodlamaio.Hrms.business.concretes;

import java.util.List;

import kodlamaio.Hrms.business.abstracts.EmployerService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.entities.concretes.Employer;

public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"İş verenler listelendi");
	}


	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İş verenler sisteme eklendi.");
	}

}
