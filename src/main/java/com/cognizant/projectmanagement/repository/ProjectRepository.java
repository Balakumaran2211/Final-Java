package com.cognizant.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.projectmanagement.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
