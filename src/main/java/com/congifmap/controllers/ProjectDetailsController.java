package com.congifmap.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.congifmap.entities.DbConfig;

@RestController
@RequestMapping("/project")
public class ProjectDetailsController {

	@Autowired
	public DbConfig dbconfig;

	@GetMapping("/envDetails")
	public String getEnvDetails() {

		return dbconfig.toString();

	}

}
