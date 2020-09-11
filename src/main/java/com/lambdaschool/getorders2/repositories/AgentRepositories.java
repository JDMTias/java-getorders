package com.lambdaschool.getorders2.repositories;

import com.lambdaschool.getorders2.models.Agent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepositories extends CrudRepository<Agent, Long> {
    @Query(value = "SELECT a.agentname, c.custname \n" +
            "FROM agents a LEFT JOIN customers c \n" +
            "ON a.agentcode = c.agentcode \n" +
            "GROUP BY c.custname \n" +
            "ORDER BY a.agentname ", nativeQuery = true)
    Agent findByAgentCode(long id);
}
