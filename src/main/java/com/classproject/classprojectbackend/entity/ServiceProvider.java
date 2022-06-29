package com.classproject.classprojectbackend.entity;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Table(name="serviceprovider")
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="serviceproviderid")
    private int serviceProviderId;

    @Column(name="companyname")
    private String companyName;

    @Column(name="licencenumber")
    private String licenceNumber;

    @Column(name="description")
    private String description;

    @Column(name="rating")
    private int  rating;

    @Column(name="category")
    private String category;

    @Column(name="location")
    private int location;



    @Column(name="result")
    private String result;

    @OneToOne
    @JoinColumn(name="userid", nullable=false)
    private Users users;

    @Column(name="golddiscount")
    private String goldDiscount;

    @Column(name="silverdiscount")
    private String silverDiscount;

    @Column(name="platinumdiscount")
    private String platinumDiscount;

    @Column(name="promocode")
    private String promoCode;

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public ServiceProvider() {
    }

    public ServiceProvider(int serviceProviderId, String companyName, String licenceNumber, String description, int rating, String category, int location, String result, Users users, String goldDiscount, String silverDiscount, String platinumDiscount) {
        this.serviceProviderId = serviceProviderId;
        this.companyName = companyName;
        this.licenceNumber = licenceNumber;
        this.description = description;
        this.rating = rating;
        this.category = category;
        this.location = location;
        this.result = result;
        this.users = users;
        this.goldDiscount = goldDiscount;
        this.silverDiscount = silverDiscount;
        this.platinumDiscount = platinumDiscount;
    }

    public int getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(int serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getGoldDiscount() {
        return goldDiscount;
    }

    public void setGoldDiscount(String goldDiscount) {
        this.goldDiscount = goldDiscount;
    }

    public String getSilverDiscount() {
        return silverDiscount;
    }

    public void setSilverDiscount(String silverDiscount) {
        this.silverDiscount = silverDiscount;
    }

    public String getPlatinumDiscount() {
        return platinumDiscount;
    }

    public void setPlatinumDiscount(String platinumDiscount) {
        this.platinumDiscount = platinumDiscount;
    }
}
