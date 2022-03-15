package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name="serviceprovider")
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="serviceproviderid")
    private int serviceProviderId;

    @Column(name="servideprovidername")
    private String servideProviderName;

    @Column(name="servideage")
    private int servideAge;

    @Column(name="userid")
    private int userId;

    public ServiceProvider() {
    }

    public ServiceProvider(int serviceProviderId, String servideProviderName, int servideAge, int userId) {
        this.serviceProviderId = serviceProviderId;
        this.servideProviderName = servideProviderName;
        this.servideAge = servideAge;
        this.userId = userId;
    }

    public int getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(int serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getServideProviderName() {
        return servideProviderName;
    }

    public void setServideProviderName(String servideProviderName) {
        this.servideProviderName = servideProviderName;
    }

    public int getServideAge() {
        return servideAge;
    }

    public void setServideAge(int servideAge) {
        this.servideAge = servideAge;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
