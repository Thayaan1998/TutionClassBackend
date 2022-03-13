package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name="askquestion")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="questionid")
    private int questionId;
    @Column(name="email")
    private String email;
    @Column(name="subject")
    private String subject;
    @Column(name="description")
    private String description;
    @Column(name="inqueringabout")
    private String inqueringAbout;
    @Column(name="attachments")
    private String attachments;
    @Column(name="serviceconsumerid ")
    private String serviceConsumerId;

    public Question() {
    }

    public Question(int questionId, String email, String subject, String description, String inqueringAbout, String attachments, String serviceConsumerId) {
        this.questionId = questionId;
        this.email = email;
        this.subject = subject;
        this.description = description;
        this.inqueringAbout = inqueringAbout;
        this.attachments = attachments;
        this.serviceConsumerId = serviceConsumerId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInqueringAbout() {
        return inqueringAbout;
    }

    public void setInqueringAbout(String inqueringAbout) {
        this.inqueringAbout = inqueringAbout;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public String getServiceConsumerId() {
        return serviceConsumerId;
    }

    public void setServiceConsumerId(String serviceConsumerId) {
        this.serviceConsumerId = serviceConsumerId;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", inqueringAbout='" + inqueringAbout + '\'' +
                ", attachments='" + attachments + '\'' +
                ", serviceConsumerId='" + serviceConsumerId + '\'' +
                '}';
    }
}
