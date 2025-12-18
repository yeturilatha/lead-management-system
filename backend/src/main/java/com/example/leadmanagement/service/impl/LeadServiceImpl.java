package com.example.leadmanagement.service.impl;

import com.example.leadmanagement.model.Lead;
import com.example.leadmanagement.repository.LeadRepository;
import com.example.leadmanagement.service.LeadService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadServiceImpl implements LeadService {

    private final LeadRepository repository;

    public LeadServiceImpl(LeadRepository repository) {
        this.repository = repository;
    }

    public Lead createLead(Lead lead) {
        return repository.save(lead);
    }

    public List<Lead> getAllLeads() {
        return repository.findAll();
    }
}
