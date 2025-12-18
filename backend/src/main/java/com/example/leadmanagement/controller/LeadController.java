package com.example.leadmanagement.controller;

import com.example.leadmanagement.model.Lead;
import com.example.leadmanagement.service.LeadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

    private final LeadService service;

    public LeadController(LeadService service) {
        this.service = service;
    }

    @PostMapping
    public Lead createLead(@RequestBody Lead lead) {
        return service.createLead(lead);
    }

    @GetMapping
    public List<Lead> getAllLeads() {
        return service.getAllLeads();
    }
}
