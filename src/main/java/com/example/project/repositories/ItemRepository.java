package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.models.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
