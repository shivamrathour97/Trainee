package com.capg.lab2.repos;

import org.springframework.stereotype.Repository;

import com.capg.lab2.entities.Trainee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TraineJpaRepository extends JpaRepository<Trainee , Integer> {
	public List<Trainee> findBytraineeName(String tr);
public List<Trainee> findBytraineeId(int id);
}
