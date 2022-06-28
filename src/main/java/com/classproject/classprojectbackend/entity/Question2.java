package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name="askquestion2")
public class Question2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="questionid")
    private int questionId;
    @Column(name="subject")
    private String subject;
    @Column(name="description")
    private String description;
    @OneToOne
    @JoinColumn(name="inqueringaboutid", nullable=false)
    private InqueringAbout inqueringAbout;
    @OneToOne
    @JoinColumn(name="serviceproviderid", nullable=false)
    private ServiceProvider serviceProvider;


    public Question2() {
    }

    public Question2(int questionId, String subject, String description, InqueringAbout inqueringAbout, ServiceProvider serviceProvider) {
        this.questionId = questionId;
        this.subject = subject;
        this.description = description;
        this.inqueringAbout = inqueringAbout;
        this.serviceProvider = serviceProvider;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
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

    public InqueringAbout getInqueringAbout() {
        return inqueringAbout;
    }

    public void setInqueringAbout(InqueringAbout inqueringAbout) {
        this.inqueringAbout = inqueringAbout;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
