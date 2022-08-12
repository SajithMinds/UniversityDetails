package com.UniversityApplication.Services;

import java.util.List;

import com.UniversityApplication.Entity.UniversityDetails;



public interface UniversityService {
	public UniversityDetails createUnv(UniversityDetails unv);
	public List<UniversityDetails> getAllUniversities();
	public UniversityDetails getUniversityId(int id,UniversityDetails unv);
	public UniversityDetails updateUnv(UniversityDetails unv,int id);

}
