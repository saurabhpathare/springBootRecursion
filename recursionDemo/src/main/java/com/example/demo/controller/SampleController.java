/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Procedeure;
import com.example.demo.dto.Requirement;
import com.example.demo.service.RecursionService;

/**
 * @author saurabh
 *
 */
@RestController
@RequestMapping("/recursion")
public class SampleController {

	@Resource
	private RecursionService recursionService;

	@RequestMapping(value = "/procedures", method = RequestMethod.GET)
	public List<Procedeure> getProcedures() {
		return recursionService.getProcedures();
	}

	@RequestMapping(value = "/requirements", method = RequestMethod.GET)
	public List<Requirement> getRequirements() {
		return recursionService.getRequirements();
	}

}
