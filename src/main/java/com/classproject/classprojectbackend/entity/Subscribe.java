package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name="subscribe")
public class Subscribe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="subscribeid")
    private int subscribeId;
    @Column(name="cardno")
    private String cardNo;
    @Column(name="packagesid")
    private  int packagesId;
    @Column(name="serviceproviderid")
    private int serviceProviderId;
    @Column(name="startdate")
    private String startDate;
    @Column(name="enddate")
    private String endDate;

    public Subscribe() {
    }

    public Subscribe(int subscribeId, String cardNo, int packagesId, int serviceProviderId, String startDate, String endDate) {
        this.subscribeId = subscribeId;
        this.cardNo = cardNo;
        this.packagesId = packagesId;
        this.serviceProviderId = serviceProviderId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getSubscribeId() {
        return subscribeId;
    }

    public void setSubscribeId(int subscribeId) {
        this.subscribeId = subscribeId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getPackagesId() {
        return packagesId;
    }

    public void setPackagesId(int packagesId) {
        this.packagesId = packagesId;
    }

    public int getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(int serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
