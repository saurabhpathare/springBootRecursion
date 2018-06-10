/**
 * 
 */
package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.example.demo.config.ProcedureSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author saurabh
 *
 */
@Entity()
public class Procedeure {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String proName;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JsonSerialize(using = ProcedureSerializer.class)
	private List<Requirement> requirement = new ArrayList<>();

	public Procedeure() {
	}

	public Procedeure(String proName) {
		this.proName = proName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public List<Requirement> getRequirement() {
		return requirement;
	}

	public void setRequirement(List<Requirement> requirement) {
		this.requirement = requirement;
	}

	public void addRequirement(Requirement requirement) {
		this.requirement.add(requirement);
	}
}
