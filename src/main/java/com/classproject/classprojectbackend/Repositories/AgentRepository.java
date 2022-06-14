package com.classproject.classprojectbackend.Repositories;

import com.classproject.classprojectbackend.entity.Agent;
import com.classproject.classprojectbackend.entity.ServiceProvider;
import com.classproject.classprojectbackend.entity.UserType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public interface AgentRepository extends CrudRepository<Agent,Integer> {

    @Query(value = "SELECT * FROM agent where result = ?1 ", nativeQuery = true)
    public  ArrayList<Agent> getAgentByResult(String result);

    @Modifying
    @Query("update Agent s set s.result = ?1 , s.promoCode=?2 where s.agentId = ?3")
    void UpdateAgent(String result,String promocode, int agentId);

    @Query(value = "SELECT COUNT(*) FROM agent", nativeQuery = true)
    public int getAgentCount();

    @Query(value = "SELECT * FROM agent where agentId = ?1 ", nativeQuery = true)
    public  Agent getAgentById(int agentId);
}
