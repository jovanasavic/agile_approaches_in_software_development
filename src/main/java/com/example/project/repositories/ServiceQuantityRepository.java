package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.models.ServiceQuantity;
import com.example.project.models.ServiceQuantityKey;

public interface ServiceQuantityRepository extends JpaRepository<ServiceQuantity, ServiceQuantityKey> {

}
	