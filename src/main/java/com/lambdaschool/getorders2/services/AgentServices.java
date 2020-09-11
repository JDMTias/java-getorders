package com.lambdaschool.getorders2.services;

import com.lambdaschool.getorders2.models.Agent;

public interface AgentServices {
    Agent findByAgentCode(long id);
}
