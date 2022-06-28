package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name="customerlikedcomments")
public class Customerlikedcomments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="likedid")
    private int likedId;

    @Column(name="customerid")
    private int customerId;

    @Column(name="commentid")
    private int commentId;

    @Column(name="serviceconsumerid")
    private int serviceConsumerId;

    public Customerlikedcomments() {
    }

    public Customerlikedcomments(int likedId, int customerId, int commentId, int serviceConsumerId) {
        this.likedId = likedId;
        this.customerId = customerId;
        this.commentId = commentId;
        this.serviceConsumerId = serviceConsumerId;
    }

    public int getLikedId() {
        return likedId;
    }

    public void setLikedId(int likedId) {
        this.likedId = likedId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getServiceConsumerId() {
        return serviceConsumerId;
    }

    public void setServiceConsumerId(int serviceConsumerId) {
        this.serviceConsumerId = serviceConsumerId;
    }
}
