package com.lambdaschool.getorders2.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agents")

public class Agent {
//    automating the ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    agent can't be null
    @Column(nullable = false)
    private long agentcode;
//    add fields
    private String agentname;
    private String workingarea;
    private double comission;
    private String phone;
    private String country;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties(value = "agent")
    private List<Customer> customers = new ArrayList<>();

//    need an empty contractor
    public Agent() {
    }

//  make constructor with all the necessary fields
    public Agent( String agentname, String workingarea, double comission, String phone,
                  String country) {
//        i think im missing  id = agentcode here?
        this.agentname = agentname;
        this.workingarea = workingarea;
        this.comission = comission;
        this.phone = phone;
        this.country = country;
    }

//    setters and getters
    public long getAgentcode() {
        return agentcode;
    }
// i think this is supposed to be commented out
    public void setAgentcode(long agentcode) {
        this.agentcode = agentcode;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public String getWorkingarea() {
        return workingarea;
    }

    public void setWorkingarea(String workingarea) {
        this.workingarea = workingarea;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
