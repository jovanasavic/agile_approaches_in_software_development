package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.models.ItemName;

public interface ItemNameRepository extends JpaRepository<ItemName, Integer> {

}
