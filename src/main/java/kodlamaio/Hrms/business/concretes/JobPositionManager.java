package kodlamaio.Hrms.business.concretes;

import java.util.List;

import kodlamaio.Hrms.business.abstracts.JobPositionService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.entities.concretes.JobPosition;
import kodlamaio.Hrms.dataAccess.abstracts.JobPositionDao;

public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"İş pozisyonları listelendi.");
	}



	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonları sisteme tanımlandı.");
	}

}
