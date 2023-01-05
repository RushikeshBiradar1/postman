package PojoClass;

public class CreateProjectWithPojoClass {
	
	String projectName;
	String projectId;
	String status;
	int teamSize;
	String createdBy;
	String createdOn;
	public CreateProjectWithPojoClass(String projectName, String projectId, String status, int teamSize, String createdBy,
			String createdOn) {
		super();
		this.projectName = projectName;
		this.projectId = projectId;
		this.status = status;
		this.teamSize = teamSize;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
	}
	
	public CreateProjectWithPojoClass() {}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

}
