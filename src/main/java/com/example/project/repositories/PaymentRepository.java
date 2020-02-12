package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.models.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
