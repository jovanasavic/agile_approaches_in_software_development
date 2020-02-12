package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.models.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer> {

}
