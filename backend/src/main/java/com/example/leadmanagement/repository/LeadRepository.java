package com.example.leadmanagement.repository;

import com.example.leadmanagement.model.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead, Long> {
}
