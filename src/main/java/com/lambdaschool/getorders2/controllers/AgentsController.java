package com.lambdaschool.getorders2.controllers;

import com.lambdaschool.getorders2.models.Agent;
import com.lambdaschool.getorders2.services.AgentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
public class AgentsController {
    @Autowired
    private AgentServices agentServices;

    // http://localhost:2019/agents/agent/{id} - Returns the agent and their customers with the given agent id

    @GetMapping(value = "/agent/{agentcode}", produces = "application/json")
    public ResponseEntity<?> findByAgentcode(@PathVariable long agentcode) {
        Agent myAgent = agentServices.findByAgentCode(agentcode);
        return new ResponseEntity<>(myAgent, HttpStatus.OK);
    }
}
