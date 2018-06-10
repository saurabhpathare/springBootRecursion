package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Procedeure;
import com.example.demo.dto.Requirement;
import com.example.demo.repo.ProcedureRepository;
import com.example.demo.repo.RequirementRepository;

@Service
public class RecursionService {
	@Autowired
	private ProcedureRepository procedureRepository;
	@Autowired
	private RequirementRepository requirementRepository;

	public List<Procedeure> getProcedures() {
		List<Procedeure> procedures = new ArrayList<>();
		Procedeure procedure = new Procedeure("Procedure1");
		Requirement requirement1 = new Requirement("Requirement1");
		procedure.addRequirement(requirement1);
		requirement1.addProcedures(procedure);
		Requirement requirement2 = new Requirement("Requirement2");
		procedure.addRequirement(requirement2);
		requirement2.addProcedures(procedure);
		procedures.add(procedure);
		procedureRepository.save(procedures);
		requirementRepository.save(requirement1);
		requirementRepository.save(requirement2);
		return procedures;
	}

	public List<Requirement> getRequirements() {
		return requirementRepository.findAll();
	}
}
