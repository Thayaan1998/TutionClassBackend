package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name="serviceconsumer")
public class ServiceConsumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="serviceconsumerid")
    private int serviceConsumerId;

    @Column(name="companyname")
    private String companyName;

    @Column(name="licencenumber")
    private String licenceNumber;

    @Column(name="businesstype")
    private String businessType;

    @Column(name="description")
    private String description;

    @Column(name="branchid")
    private int branchId ;

    @OneToOne
    @JoinColumn(name="userid", nullable=false)
    private Users users;

    public ServiceConsumer(int serviceConsumerId, String companyName, String licenceNumber, String businessType, String description, int branchId, Users users) {
        this.serviceConsumerId = serviceConsumerId;
        this.companyName = companyName;
        this.licenceNumber = licenceNumber;
        this.businessType = businessType;
        this.description = description;
        this.branchId = branchId;
        this.users = users;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceConsumer() {
    }

    public int getServiceConsumerId() {
        return serviceConsumerId;
    }

    public void setServiceConsumerId(int serviceConsumerId) {
        this.serviceConsumerId = serviceConsumerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }


}
