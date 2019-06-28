package com.cskaoyan.bean;

import java.util.Date;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/28 0:06
 **/
public class TechnologyRequirement {
    private String technologyRequirementId;
    private String technologyName;
    private String technologyId;
    private String requirement;
    private Date addTime;
    private Date reviseTime;

    public String getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId;
    }

    public TechnologyRequirement() {
    }

    public TechnologyRequirement(String technologyRequirementId, String technologyName, String technologyId, String requirement, Date addTime, Date reviseTime) {
        this.technologyRequirementId = technologyRequirementId;
        this.technologyName = technologyName;
        this.technologyId = technologyId;
        this.requirement = requirement;
        this.addTime = addTime;
        this.reviseTime = reviseTime;
    }

    public String getTechnologyRequirementId() {
        return technologyRequirementId;
    }

    public void setTechnologyRequirementId(String technologyRequirementId) {
        this.technologyRequirementId = technologyRequirementId;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getReviseTime() {
        return reviseTime;
    }

    public void setReviseTime(Date reviseTime) {
        this.reviseTime = reviseTime;
    }
}
