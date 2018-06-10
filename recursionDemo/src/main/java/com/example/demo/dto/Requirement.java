package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.example.demo.config.RequirementSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class Requirement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String reqName;
	@JsonSerialize(using = RequirementSerializer.class)
	@ManyToMany(cascade = { CascadeType.ALL })
	private List<Procedeure> procedures = new ArrayList<>();

	public Requirement() {

	}

	public Requirement(String reqName) {
		this.reqName = reqName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReqName() {
		return reqName;
	}

	public void setReqName(String reqName) {
		this.reqName = reqName;
	}

	public List<Procedeure> getProcedures() {
		return procedures;
	}

	public void setProcedures(List<Procedeure> procedures) {
		this.procedures = procedures;
	}

	public void addProcedures(Procedeure procedure) {
		this.procedures.add(procedure);
	}
}
