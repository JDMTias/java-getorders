package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Agent;

public interface AgentServices {
    Agent findByAgentCode(long id);
}
