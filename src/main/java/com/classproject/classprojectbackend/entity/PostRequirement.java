package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name="postrequirement")
public class PostRequirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="requirementid")
    private  int requirementId;

    @Column(name="location")
    private String location;

    @Column(name="requirementdetails")
    private String requirementDetails;

    @Column(name="email")
    private String email;

    @Column(name="phonenumber")
    private String phonenumber;

    @Column(name="category")
    private String category;

    @Column(name="serviceconsumerid")
    private int serviceConsumerId;

    public PostRequirement(int requirementId, String location, String requirementDetails, String email, String phonenumber, String category, int serviceConsumerId) {
        this.requirementId = requirementId;
        this.location = location;
        this.requirementDetails = requirementDetails;
        this.email = email;
        this.phonenumber = phonenumber;
        this.category = category;
        this.serviceConsumerId = serviceConsumerId;
    }

    public PostRequirement() {
    }

    public int getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(int requirementId) {
        this.requirementId = requirementId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRequirementDetails() {
        return requirementDetails;
    }

    public void setRequirementDetails(String requirementDetails) {
        this.requirementDetails = requirementDetails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getServiceConsumerId() {
        return serviceConsumerId;
    }

    public void setServiceConsumerId(int serviceConsumerId) {
        this.serviceConsumerId = serviceConsumerId;
    }

    @Override
    public String toString() {
        return "PostRequirement{" +
                "requirementId=" + requirementId +
                ", location='" + location + '\'' +
                ", requirementDetails='" + requirementDetails + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", category='" + category + '\'' +
                ", serviceConsumerId=" + serviceConsumerId +
                '}';
    }
}
