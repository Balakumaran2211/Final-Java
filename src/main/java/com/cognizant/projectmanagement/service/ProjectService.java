package com.cognizant.projectmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.projectmanagement.entity.Project;
import com.cognizant.projectmanagement.entity.User;
import com.cognizant.projectmanagement.model.ProjectObj;
import com.cognizant.projectmanagement.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	// @Autowired
	// private Project project;

	// @Autowired
	// private ProjectObj p;

	// @Autowired
	// private User u;

	public ProjectObj addProject(ProjectObj p) {
		Project project = new Project();
		project.setProject(p.getProjectName());
		project.setStartDate(p.getStartDate());
		project.setEndDate(p.getEndDate());
		project.setPriority(p.getPriority());
		User user = new User();
		user.setUserId(p.getUserId());
		project.setUser(user);
		projectRepository.save(project);
		p.setCompletedTaskNumber(0L);
		p.setTaskNumber(0);
		return p;
	}

	public ProjectObj updateProject(ProjectObj p) {
		Project project = projectRepository.findOne(p.getProjectId());
		if (project != null) {
			project.setProject(p.getProjectName());
			project.setStartDate(p.getStartDate());
			project.setEndDate(p.getEndDate());
			project.setPriority(p.getPriority());

			User user = new User();
			user.setUserId(p.getUserId());
			project.setUser(user);
			projectRepository.save(project);
			return p;
		} else {
			return null;
		}
	}

	public List<ProjectObj> getAllProject() {
		Iterable<Project> projectList = projectRepository.findAll();
		List<ProjectObj> projectResponseList = new ArrayList<>();
		for (Project project : projectList) {
			ProjectObj p = new ProjectObj();
			p.setProjectId(project.getProjectId());
			p.setProjectName(project.getProject());
			p.setStartDate(project.getStartDate());
			p.setEndDate(project.getEndDate());
			p.setPriority(project.getPriority());
			p.setTaskNumber(project.getTasks().size());
			p.setCompletedTaskNumber(
					project.getTasks().stream().filter(task -> "COMPLETED".equals(task.getStatus())).count());

			if (null != project.getUser()) {
				p.setUserId(project.getUser().getUserId());
				p.setManager(project.getUser().getFirstName());
			}

			projectResponseList.add(p);
		}

		return projectResponseList;
	}

}
