package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity

@Table(name="payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="paymentid")
    private int paymentId;

    @Column(name="agentid")
    private  int agentId;

    @Column(name="amount")
    private String amount;

    public Payment() {
    }

    public Payment(int paymentId, int agentId, String amount) {
        this.paymentId = paymentId;
        this.agentId = agentId;
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
