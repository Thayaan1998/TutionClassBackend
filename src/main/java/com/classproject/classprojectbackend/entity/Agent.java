package com.classproject.classprojectbackend.entity;


import javax.persistence.*;

@Entity

@Table(name="agent")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="agentid ")
    private int agentId;

    @Column(name="nicnumber")
    private String nicNumber;

    @Column(name="dob")
    private String dob;

    @Column(name="type")
    private String type;

    @Column(name="promocode")
    private String promoCode;

    @OneToOne
    @JoinColumn(name="userid", nullable=false)
    private Users users;

    @Column(name="result")
    private String result;

    @Column(name="promocount")
    private int promocount;

    @Column(name="golddiscount")
    private String goldDiscount;

    @Column(name="silverdiscount")
    private String silverDiscount;

    @Column(name="platinumdiscount")
    private String platinumDiscount;

    @Column(name="totalamount")
    private int totalamount;

    public Agent() {
    }

    public Agent(int agentId, String nicNumber, String dob, String type, String promoCode, Users users, String result, int promocount, String goldDiscount, String silverDiscount, String platinumDiscount, int totalamount) {
        this.agentId = agentId;
        this.nicNumber = nicNumber;
        this.dob = dob;
        this.type = type;
        this.promoCode = promoCode;
        this.users = users;
        this.result = result;
        this.promocount = promocount;
        this.goldDiscount = goldDiscount;
        this.silverDiscount = silverDiscount;
        this.platinumDiscount = platinumDiscount;
        this.totalamount = totalamount;
    }


    public int getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getPromocount() {
        return promocount;
    }

    public void setPromocount(int promocount) {
        this.promocount = promocount;
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
