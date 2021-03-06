package com.classproject.classprojectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name="askquestion")
public class Question {
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
    @JoinColumn(name="serviceconsumerid", nullable=false)
    private ServiceConsumer serviceConsumer;
    @Column(name="serviceproviderid")
    private int serviceProviderId;


    public Question() {
    }

    public Question(int questionId, String subject, String description, InqueringAbout inqueringAbout, ServiceConsumer serviceConsumer, int serviceProviderId) {
        this.questionId = questionId;
        this.subject = subject;
        this.description = description;
        this.inqueringAbout = inqueringAbout;
        this.serviceConsumer = serviceConsumer;
        this.serviceProviderId = serviceProviderId;
    }

    public int getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(int serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
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

    public ServiceConsumer getServiceConsumer() {
        return serviceConsumer;
    }

    public void setServiceConsumer(ServiceConsumer serviceConsumer) {
        this.serviceConsumer = serviceConsumer;
    }
}
