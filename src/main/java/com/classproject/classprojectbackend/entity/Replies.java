package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name="replies")
public class Replies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="replyid")
    private int replyId;

    @Column(name="reply")
    private String reply;

    @Column(name="commentsid")
    private int commentId;

    @Column(name="serviceconsumerid")
    private int serviceConsumerId;

    @Column(name="serviceproviderid")
    private int serviceProviderId;

    @Column(name="name")
    private String name;

    public Replies() {
    }

    public Replies(int replyId, String reply, int commentId, int serviceConsumerId, int serviceProviderId, String name) {
        this.replyId = replyId;
        this.reply = reply;
        this.commentId = commentId;
        this.serviceConsumerId = serviceConsumerId;
        this.serviceProviderId = serviceProviderId;
        this.name = name;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
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
