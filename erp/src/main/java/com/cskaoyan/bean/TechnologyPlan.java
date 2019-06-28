package com.cskaoyan.bean;

import java.util.Date;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/28 14:54
 **/
public class TechnologyPlan {
    private String technologyPlanId;
    private String technologyName;
    private int batchAmount;
    private Date startPlan;
    private Date endPlan;
    private Date commitPlan;
    private Date technologyStartPlan;
    private Date  technologyEndPlan;
    public Process process;

    public TechnologyPlan() {
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public String getTechnologyPlanId() {
        return technologyPlanId;
    }

    public void setTechnologyPlanId(String technologyPlanId) {
        this.technologyPlanId = technologyPlanId;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public int getBatchAmount() {
        return batchAmount;
    }

    public void setBatchAmount(int batchAmount) {
        this.batchAmount = batchAmount;
    }

    public Date getStartPlan() {
        return startPlan;
    }

    public void setStartPlan(Date startPlan) {
        this.startPlan = startPlan;
    }

    public Date getEndPlan() {
        return endPlan;
    }

    public void setEndPlan(Date endPlan) {
        this.endPlan = endPlan;
    }

    public Date getCommitPlan() {
        return commitPlan;
    }

    public void setCommitPlan(Date commitPlan) {
        this.commitPlan = commitPlan;
    }


    public Date getTechnologyStartPlan() {
        return technologyStartPlan;
    }

    public void setTechnologyStartPlan(Date technologyStartPlan) {
        this.technologyStartPlan = technologyStartPlan;
    }

    public Date getTechnologyEndPlan() {
        return technologyEndPlan;
    }

    public void setTechnologyEndPlan(Date technologyEndPlan) {
        this.technologyEndPlan = technologyEndPlan;
    }

    @Override
    public String toString() {
        return "TechnologyPlan{" +
                "technologyPlanId='" + technologyPlanId + '\'' +
                ", technologyName='" + technologyName + '\'' +
                ", batchAmount=" + batchAmount +
                ", startPlan=" + startPlan +
                ", endPlan=" + endPlan +
                ", commitPlan=" + commitPlan +
                ", technologyStartPlan=" + technologyStartPlan +
                ", technologyEndPlan=" + technologyEndPlan +
                ", process=" + process +
                '}';
    }

    public TechnologyPlan(String technologyPlanId, String technologyName, int batchAmount, Date startPlan, Date endPlan, Date commitPlan, Date technologyStartPlan, Date technologyEndPlan, Process process) {
        this.technologyPlanId = technologyPlanId;
        this.technologyName = technologyName;
        this.batchAmount = batchAmount;
        this.startPlan = startPlan;
        this.endPlan = endPlan;
        this.commitPlan = commitPlan;
        this.technologyStartPlan = technologyStartPlan;
        this.technologyEndPlan = technologyEndPlan;
        this.process = process;
    }
}
