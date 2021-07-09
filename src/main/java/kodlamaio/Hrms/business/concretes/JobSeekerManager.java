package kodlamaio.Hrms.business.concretes;

import java.util.List;

import kodlamaio.Hrms.business.abstracts.JobSeekerService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.Hrms.entities.concretes.JobSeeker;

public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao = jobSeekerDao;
	}

	
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"İş arayanlar listelendi.");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("İş arayan sisteme eklendi.");
	}

}
