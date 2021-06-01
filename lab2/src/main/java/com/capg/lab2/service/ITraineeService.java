package com.capg.lab2.service;

import java.util.List;

import com.capg.lab2.entities.Trainee;



public interface ITraineeService {
	
public Trainee insert(Trainee trainee);
public List<Trainee> listAllTrainee();
public List<Trainee> listAllTraineeByName(String tr);
public List<Trainee> listAllTraineeById(int id);
public void deleteAllTraineeById(int id);
}
