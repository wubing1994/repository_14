package com.cskaoyan.bean;

import java.util.Date;

public class DeviceType {

    private String deviceTypeId;        //设备种类编号

    private String deviceTypeName;      //设备种类名称

    private String deviceTypeModel;     //型号

    private String deviceTypeSpec;      //规格

    private String deviceTypeSupplier;  //供应商

    private String deviceTypeProducer;  //生产商

    private int deviceTypeQuantity;   //台数

    private Date deviceTypeWarranty;    //保修期

    public DeviceType() {
    }

    public DeviceType(String deviceTypeName, String deviceTypeModel, String deviceTypeSpec, String deviceTypeSupplier, String deviceTypeProducer, int deviceTypeQuantity, Date deviceTypeWarranty) {
        this.deviceTypeName = deviceTypeName;
        this.deviceTypeModel = deviceTypeModel;
        this.deviceTypeSpec = deviceTypeSpec;
        this.deviceTypeSupplier = deviceTypeSupplier;
        this.deviceTypeProducer = deviceTypeProducer;
        this.deviceTypeQuantity = deviceTypeQuantity;
        this.deviceTypeWarranty = deviceTypeWarranty;
    }

    public String getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    public String getDeviceTypeModel() {
        return deviceTypeModel;
    }

    public void setDeviceTypeModel(String deviceTypeModel) {
        this.deviceTypeModel = deviceTypeModel;
    }

    public String getDeviceTypeSpec() {
        return deviceTypeSpec;
    }

    public void setDeviceTypeSpec(String deviceTypeSpec) {
        this.deviceTypeSpec = deviceTypeSpec;
    }

    public String getDeviceTypeSupplier() {
        return deviceTypeSupplier;
    }

    public void setDeviceTypeSupplier(String deviceTypeSupplier) {
        this.deviceTypeSupplier = deviceTypeSupplier;
    }

    public String getDeviceTypeProducer() {
        return deviceTypeProducer;
    }

    public void setDeviceTypeProducer(String deviceTypeProducer) {
        this.deviceTypeProducer = deviceTypeProducer;
    }

    public int getDeviceTypeQuantity() {
        return deviceTypeQuantity;
    }

    public void setDeviceTypeQuantity(int deviceTypeQuantity) {
        this.deviceTypeQuantity = deviceTypeQuantity;
    }

    public Date getDeviceTypeWarranty() {
        return deviceTypeWarranty;
    }

    public void setDeviceTypeWarranty(Date deviceTypeWarranty) {
        this.deviceTypeWarranty = deviceTypeWarranty;
    }

    @Override
    public String toString() {
        return "DeviceType{" +
                "deviceTypeId='" + deviceTypeId + '\'' +
                ", deviceTypeName='" + deviceTypeName + '\'' +
                ", deviceTypeModel='" + deviceTypeModel + '\'' +
                ", deviceTypeSpec='" + deviceTypeSpec + '\'' +
                ", deviceTypeSupplier='" + deviceTypeSupplier + '\'' +
                ", deviceTypeProducer='" + deviceTypeProducer + '\'' +
                ", deviceTypeQuanlitity=" + deviceTypeQuantity +
                ", deviceTypeWarranty=" + deviceTypeWarranty +
                '}';
    }
}
