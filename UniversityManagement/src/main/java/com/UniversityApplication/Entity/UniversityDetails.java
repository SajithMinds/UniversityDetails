package com.UniversityApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="University_Table")
public class UniversityDetails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Universityname")
 	private String Universityname;
	@Column(name="totalColleges")
	private long totalColleges;
	public UniversityDetails(String universityname, long totalColleges) {
		super();
		Universityname = universityname;
		this.totalColleges = totalColleges;
	}
	public UniversityDetails() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUniversityname() {
		return Universityname;
	}
	public void setUniversityname(String universityname) {
		Universityname = universityname;
	}
	public long getTotalColleges() {
		return totalColleges;
	}
	public void setTotalColleges(long totalColleges) {
		this.totalColleges = totalColleges;
	}
 	
}
