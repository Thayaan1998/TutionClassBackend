package com.classproject.classprojectbackend.service;

import com.classproject.classprojectbackend.Repositories.AgentRepository;
import com.classproject.classprojectbackend.Repositories.CommentsRepository;
import com.classproject.classprojectbackend.Repositories.PaymentRepository;
import com.classproject.classprojectbackend.entity.Agent;
import com.classproject.classprojectbackend.entity.Customerlikedcomments;
import com.classproject.classprojectbackend.entity.Payment;
import com.classproject.classprojectbackend.entity.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgentService {

    @Autowired(required=true)
    private AgentRepository agentRepository;

    @Autowired(required=true)
    private PaymentRepository paymentRepository;

    public  void saveAgent(Agent agent){
        agentRepository.save(agent);
    }

    public ArrayList<Agent> getAgentByResult(String result) {

        return  (  ArrayList<Agent>)agentRepository.getAgentByResult(result);
    }



    public void updatAgentByResult(String result,String promocode,int  agentId) {

        agentRepository.UpdateAgent(result,promocode,agentId);
    }

    public int agentCount() {

        return  agentRepository.getAgentCount();
    }

    public Agent getAgentById(int Id) {

        return  agentRepository.getAgentById(Id);
    }

    public Agent getAgentByUser(int Id) {

        return  agentRepository.getServiceAgentByUser(Id);
    }

    public Agent getAgentByPromo(String promoCode){
        return agentRepository.getServiceAgentByPromo(promoCode);
    }

    public void updatePromoCount(String promoCode) {

        agentRepository.UpdatepromoCount(promoCode);

        int promoCount=agentRepository.getPromoCount(promoCode);

        if(promoCount==20){
            agentRepository.UpdateDiscount("700","300","1000",promoCode);
        }else if(promoCount==50){
            agentRepository.UpdateDiscount("1000","400","1500",promoCode);

        }
    }

    public void updateAmount(String promoCode) {

        agentRepository.UpdateAmount(promoCode);
    }

    public void savePayment(Payment payment) {
        agentRepository.UpdateAmount2(payment.getAgentId());
        paymentRepository.save(payment);
    }

    public ArrayList<Payment> getPayment(int  result) {
        return (ArrayList<Payment>)paymentRepository.getPaymentBy(result);
    }
}
