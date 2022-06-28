package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity

@Table(name="comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="commentsid ")
    private int commentsId;
    @Column(name="review")
    private String review;
    @Column(name="rating")
    private String rating;
    @Column(name="likes")
    private int  likes;
    @Column(name="dislikes")
    private int  dislikes;
    @Column(name="replies")
    private int  replies;
    @Column(name="serviceconsumerid")
    private int serviceConsumerId;
    @Column(name="serviceproviderid")
    private int serviceProviderId;
    @Column(name="name")
    private String name;

    public Comments(int commentsId, String review, String rating, int likes, int dislikes, int replies, int serviceConsumerId, int serviceProviderId, String name) {
        this.commentsId = commentsId;
        this.review = review;
        this.rating = rating;
        this.likes = likes;
        this.dislikes = dislikes;
        this.replies = replies;
        this.serviceConsumerId = serviceConsumerId;
        this.serviceProviderId = serviceProviderId;
        this.name = name;
    }

    public Comments() {
    }

    public int getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(int commentsId) {
        this.commentsId = commentsId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getReplies() {
        return replies;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public int getServiceConsumerId() {
        return serviceConsumerId;
    }

    public void setServiceConsumerId(int serviceConsumerId) {
        this.serviceConsumerId = serviceConsumerId;
    }

    public int getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(int serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
