package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Requirement;

public interface RequirementRepository extends JpaRepository<Requirement, Long> {

}
