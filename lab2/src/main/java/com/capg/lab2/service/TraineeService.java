package com.capg.lab2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.lab2.entities.Trainee;
import com.capg.lab2.repos.TraineJpaRepository;



@Service
public class TraineeService implements ITraineeService {

	@Autowired
	TraineJpaRepository repo;

	@Override
	public Trainee insert(Trainee trainee) {
		
		return repo.save(trainee);
	}

	@Override
	public List<Trainee> listAllTrainee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Trainee> listAllTraineeByName(String tr) {
		// TODO Auto-generated method stub
		return repo.findBytraineeName(tr);
	}

	@Override
	public List<Trainee> listAllTraineeById(int id) {
		// TODO Auto-generated method stub
		return repo.findBytraineeId(id);
	}

	@Override
	public void deleteAllTraineeById(int id) {
		repo.deleteById(id);
		
	}

	

	

	

	

	
	

	
	
	
	
	
	

}
