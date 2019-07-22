package com.cognizant.projectmanagement.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ProjectObj {

	private Long projectId;

	private String projectName;

	private Date startDate;

	private Date endDate;

	private Integer priority;

	private Integer taskNumber;

	private Long completedTaskNumber;

	private String manager;

	private Integer userId;

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTaskNumber() {
		return taskNumber;
	}

	public void setTaskNumber(Integer taskNumber) {
		this.taskNumber = taskNumber;
	}

	public Long getCompletedTaskNumber() {
		return completedTaskNumber;
	}

	public void setCompletedTaskNumber(Long completedTaskNumber) {
		this.completedTaskNumber = completedTaskNumber;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

}
