package com.cognizant.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.projectmanagement.entity.ParentTask;

@Repository
public interface ParentTaskRepository extends JpaRepository<ParentTask, Integer> {

}
