package com.example.leadmanagement.service;

import com.example.leadmanagement.model.Lead;
import java.util.List;

public interface LeadService {
    Lead createLead(Lead lead);
    List<Lead> getAllLeads();
}
