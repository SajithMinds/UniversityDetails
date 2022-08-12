package com.UniversityApplication.Repository;

import org.springframework.data.repository.CrudRepository;

import com.UniversityApplication.Entity.UniversityDetails;

public interface UniversityRepository extends CrudRepository<UniversityDetails, Integer> {

}
