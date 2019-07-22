package com.cognizant.projectmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.projectmanagement.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
