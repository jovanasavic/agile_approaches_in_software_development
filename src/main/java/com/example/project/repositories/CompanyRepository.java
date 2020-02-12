package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
