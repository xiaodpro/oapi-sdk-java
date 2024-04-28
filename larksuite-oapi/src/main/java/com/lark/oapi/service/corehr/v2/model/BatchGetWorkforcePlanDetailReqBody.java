package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;

public class BatchGetWorkforcePlanDetailReqBody {

    @SerializedName("workforce_plan_id")
    private String workforcePlanId;
    @SerializedName("is_centralized_reporting_project")
    private Boolean isCentralizedReportingProject;
    @SerializedName("centralized_reporting_project_id")
    private String centralizedReportingProjectId;
    @SerializedName("department_ids")
    private String[] departmentIds;
    @SerializedName("employee_type_ids")
    private String[] employeeTypeIds;
    @SerializedName("work_location_ids")
    private String[] workLocationIds;
    @SerializedName("job_family_ids")
    private String[] jobFamilyIds;
    @SerializedName("job_level_ids")
    private String[] jobLevelIds;
    @SerializedName("job_ids")
    private String[] jobIds;
    @SerializedName("cost_center_ids")
    private String[] costCenterIds;

    public String getWorkforcePlanId() {
        return workforcePlanId;
    }

    public void setWorkforcePlanId(String workforcePlanId) {
        this.workforcePlanId = workforcePlanId;
    }

    public Boolean getIsCentralizedReportingProject() {
        return isCentralizedReportingProject;
    }

    public void setIsCentralizedReportingProject(Boolean isCentralizedReportingProject) {
        this.isCentralizedReportingProject = isCentralizedReportingProject;
    }

    public String getCentralizedReportingProjectId() {
        return centralizedReportingProjectId;
    }

    public void setCentralizedReportingProjectId(String centralizedReportingProjectId) {
        this.centralizedReportingProjectId = centralizedReportingProjectId;
    }

    public String[] getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(String[] departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String[] getEmployeeTypeIds() {
        return employeeTypeIds;
    }

    public void setEmployeeTypeIds(String[] employeeTypeIds) {
        this.employeeTypeIds = employeeTypeIds;
    }

    public String[] getWorkLocationIds() {
        return workLocationIds;
    }

    public void setWorkLocationIds(String[] workLocationIds) {
        this.workLocationIds = workLocationIds;
    }

    public String[] getJobFamilyIds() {
        return jobFamilyIds;
    }

    public void setJobFamilyIds(String[] jobFamilyIds) {
        this.jobFamilyIds = jobFamilyIds;
    }

    public String[] getJobLevelIds() {
        return jobLevelIds;
    }

    public void setJobLevelIds(String[] jobLevelIds) {
        this.jobLevelIds = jobLevelIds;
    }

    public String[] getJobIds() {
        return jobIds;
    }

    public void setJobIds(String[] jobIds) {
        this.jobIds = jobIds;
    }

    public String[] getCostCenterIds() {
        return costCenterIds;
    }

    public void setCostCenterIds(String[] costCenterIds) {
        this.costCenterIds = costCenterIds;
    }

    public BatchGetWorkforcePlanDetailReqBody() {
    }

    public BatchGetWorkforcePlanDetailReqBody(Builder builder) {
        this.workforcePlanId = builder.workforcePlanId;
        this.isCentralizedReportingProject = builder.isCentralizedReportingProject;
        this.centralizedReportingProjectId = builder.centralizedReportingProjectId;
        this.departmentIds = builder.departmentIds;
        this.employeeTypeIds = builder.employeeTypeIds;
        this.workLocationIds = builder.workLocationIds;
        this.jobFamilyIds = builder.jobFamilyIds;
        this.jobLevelIds = builder.jobLevelIds;
        this.jobIds = builder.jobIds;
        this.costCenterIds = builder.costCenterIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String workforcePlanId;
        private Boolean isCentralizedReportingProject;
        private String centralizedReportingProjectId;
        private String[] departmentIds;
        private String[] employeeTypeIds;
        private String[] workLocationIds;
        private String[] jobFamilyIds;
        private String[] jobLevelIds;
        private String[] jobIds;
        private String[] costCenterIds;

        public Builder() {
        }

        public Builder workforcePlanId(String workforcePlanId) {
            this.workforcePlanId = workforcePlanId;
            return this;
        }

        public Builder isCentralizedReportingProject(Boolean isCentralizedReportingProject) {
            this.isCentralizedReportingProject = isCentralizedReportingProject;
            return this;
        }

        public Builder centralizedReportingProjectId(String centralizedReportingProjectId) {
            this.centralizedReportingProjectId = centralizedReportingProjectId;
            return this;
        }

        public Builder departmentIds(String[] departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }

        public Builder employeeTypeIds(String[] employeeTypeIds) {
            this.employeeTypeIds = employeeTypeIds;
            return this;
        }

        public Builder workLocationIds(String[] workLocationIds) {
            this.workLocationIds = workLocationIds;
            return this;
        }

        public Builder jobFamilyIds(String[] jobFamilyIds) {
            this.jobFamilyIds = jobFamilyIds;
            return this;
        }

        public Builder jobLevelIds(String[] jobLevelIds) {
            this.jobLevelIds = jobLevelIds;
            return this;
        }

        public Builder jobIds(String[] jobIds) {
            this.jobIds = jobIds;
            return this;
        }

        public Builder costCenterIds(String[] costCenterIds) {
            this.costCenterIds = costCenterIds;
            return this;
        }

        public BatchGetWorkforcePlanDetailReqBody build() {
            return new BatchGetWorkforcePlanDetailReqBody(this);
        }
    }

}
