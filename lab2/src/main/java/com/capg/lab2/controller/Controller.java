package com.capg.lab2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.lab2.entities.Trainee;
import com.capg.lab2.service.ITraineeService;



@RestController
public class Controller {
	@Autowired
	ITraineeService ser;
	
	@RequestMapping(value="/trainee", method=RequestMethod.POST)
	
	public Trainee traineeDetails(@RequestBody Trainee trainee) {
		return ser.insert(trainee);
	}
	@GetMapping("/get")
	public List<Trainee>  getAllTrainee(){
		return ser.listAllTrainee();
	}
	@GetMapping("/chalodo/{tr}")
	public List<Trainee> getTraineeName(@PathVariable String tr){
		return ser.listAllTraineeByName(tr);
	}
	@GetMapping("/sal/{id}")
	public List<Trainee> getTraineeSalary(@PathVariable int id){
		return ser.listAllTraineeById(id);
	}
	@DeleteMapping("/del/{id}")
	public void deleteTraineeId(@PathVariable int id) {
		ser.deleteAllTraineeById(id);
	}

}
