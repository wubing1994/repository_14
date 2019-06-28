package com.cskaoyan.bean;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/27 16:50
 **/
public class Technology {
    private int doubleCapacity;
    private int overfulfilCapacity;
    private int overtimeOverfulfilCapacity;
    private int overtimeStandardCapacity;
    private double price;
    private int standardCapacity;
    private String technologyId;
    private String technologyName;
    private String vitalProcessPeriod;
   /* public TechnologyPlan technologyPlan;*/
    public TechnologyRequirement technologyRequirement;

    public Technology() {
    }

    public Technology(int doubleCapacity, int overfulfilCapacity, int overtimeOverfulfilCapacity, int overtimeStandardCapacity, double price, int standardCapacity, String technologyId, String technologyName, String vitalProcessPeriod) {
        this.doubleCapacity = doubleCapacity;
        this.overfulfilCapacity = overfulfilCapacity;
        this.overtimeOverfulfilCapacity = overtimeOverfulfilCapacity;
        this.overtimeStandardCapacity = overtimeStandardCapacity;
        this.price = price;
        this.standardCapacity = standardCapacity;
        this.technologyId = technologyId;
        this.technologyName = technologyName;
        this.vitalProcessPeriod = vitalProcessPeriod;
    }

    @Override
    public String toString() {
        return "Technology{" +
                "doubleCapacity=" + doubleCapacity +
                ", overfulfilCapacity=" + overfulfilCapacity +
                ", overtimeOverfulfilCapacity=" + overtimeOverfulfilCapacity +
                ", overtimeStandardCapacity=" + overtimeStandardCapacity +
                ", price=" + price +
                ", standardCapacity=" + standardCapacity +
                ", technologyId='" + technologyId + '\'' +
                ", technologyName='" + technologyName + '\'' +
                ", vitalProcessPeriod='" + vitalProcessPeriod + '\'' +
                '}';
    }
    /* public TechnologyPlan getTechnologyPlan() {
        return technologyPlan;
    }

    public void setTechnologyPlan(TechnologyPlan technologyPlan) {
        this.technologyPlan = technologyPlan;
    }*/

    public TechnologyRequirement getTechnologyRequirement() {
        return technologyRequirement;
    }

    public void setTechnologyRequirement(TechnologyRequirement technologyRequirement) {
        this.technologyRequirement = technologyRequirement;
    }

    public int getDoubleCapacity() {
        return doubleCapacity;
    }

    public void setDoubleCapacity(int doubleCapacity) {
        this.doubleCapacity = doubleCapacity;
    }

    public int getOverfulfilCapacity() {
        return overfulfilCapacity;
    }

    public void setOverfulfilCapacity(int overfulfilCapacity) {
        this.overfulfilCapacity = overfulfilCapacity;
    }

    public int getOvertimeOverfulfilCapacity() {
        return overtimeOverfulfilCapacity;
    }

    public void setOvertimeOverfulfilCapacity(int overtimeOverfulfilCapacity) {
        this.overtimeOverfulfilCapacity = overtimeOverfulfilCapacity;
    }

    public int getOvertimeStandardCapacity() {
        return overtimeStandardCapacity;
    }

    public void setOvertimeStandardCapacity(int overtimeStandardCapacity) {
        this.overtimeStandardCapacity = overtimeStandardCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStandardCapacity() {
        return standardCapacity;
    }

    public void setStandardCapacity(int standardCapacity) {
        this.standardCapacity = standardCapacity;
    }

    public String getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public String getVitalProcessPeriod() {
        return vitalProcessPeriod;
    }

    public void setVitalProcessPeriod(String vitalProcessPeriod) {
        this.vitalProcessPeriod = vitalProcessPeriod;
    }
}
