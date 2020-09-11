package com.lambdaschool.getorders2.services;

import com.lambdaschool.getorders2.models.Agent;
import com.lambdaschool.getorders2.repositories.AgentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "agentServices")
public class AgentServicesImpl implements AgentServices{
    @Autowired
    private AgentRepositories agentrepos;

    @Override
    public Agent findByAgentCode(long id) {
        return agentrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Agent " + id + " Not Found!"));
    }
}
