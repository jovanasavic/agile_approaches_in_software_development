package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer> {

	
}
