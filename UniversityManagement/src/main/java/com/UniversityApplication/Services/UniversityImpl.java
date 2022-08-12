package com.UniversityApplication.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.UniversityApplication.Entity.UniversityDetails;
import com.UniversityApplication.Exception.UniversityNotFoundException;
import com.UniversityApplication.Repository.UniversityRepository;

@Component
public class UniversityImpl implements UniversityService{
	@Autowired
	UniversityRepository repos;
	
	public UniversityDetails createUnv(UniversityDetails unv) {
		return repos.save(unv);
	}


	public List<UniversityDetails> getAllUniversities() {
		List<UniversityDetails> list = (List<UniversityDetails>) repos.findAll();
		return list;
	}


	public UniversityDetails getUniversityId(int id, UniversityDetails unv) {
		return repos.findById(id).orElseThrow(()->new UniversityNotFoundException("Employee id not found with id :"+unv.getId()));
		
	}

	public UniversityDetails updateUnv(UniversityDetails unv, int id) {
	
		UniversityDetails oldUnv=this.repos.findById(id)
					.orElseThrow(()->new UniversityNotFoundException("Employee id not found with id :"+unv.getId()));
			oldUnv.setUniversityname(unv.getUniversityname());
			oldUnv.setTotalColleges(unv.getTotalColleges());
		
			repos.save(oldUnv);
			return oldUnv;
		
	}

}
