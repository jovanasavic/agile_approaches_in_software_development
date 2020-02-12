package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.models.Service;

public interface ServiceRepository extends JpaRepository<Service, Integer> {

}
