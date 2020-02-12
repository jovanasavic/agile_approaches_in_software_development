package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
