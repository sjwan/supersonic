package com.tencent.supersonic.chat.service;

import com.tencent.supersonic.auth.api.authentication.pojo.User;
import com.tencent.supersonic.chat.agent.Agent;
import java.util.List;

public interface AgentService {

    List<Agent> getAgents();

    void createAgent(Agent agent, User user);

    void updateAgent(Agent agent, User user);

    Agent getAgent(Integer id);

    void deleteAgent(Integer id);
    
}