package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Procedeure;

public interface ProcedureRepository extends JpaRepository<Procedeure, Long> {

}
