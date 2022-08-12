package com.UniversityApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UniversityApplication.Entity.UniversityDetails;
import com.UniversityApplication.Services.UniversityImpl;


@RestController
@RequestMapping("/Unv")
public class UniversityController {
@Autowired
UniversityImpl college;

@PostMapping("/save")
public UniversityDetails saveEmployee(@RequestBody UniversityDetails unv) {
	return college.createUnv(unv);
}

@GetMapping("/list")
public List< UniversityDetails> getAllUniversities(){
	return college.getAllUniversities();
}
@GetMapping("/list/{id}")
public UniversityDetails getUniversityId(@PathVariable int id,  @RequestBody UniversityDetails unv) {
	return college.getUniversityId(id, unv);
}
@PutMapping("/listu/{id}")
public UniversityDetails updateEmployee(@PathVariable int id,
		@RequestBody  UniversityDetails unv) {
	return college.updateUnv(unv, id);
}

}
