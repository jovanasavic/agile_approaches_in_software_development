package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.ServiceQuantity;
import models.ServiceQuantityKey;

public interface ServiceQuantityRepository extends JpaRepository<ServiceQuantity, ServiceQuantityKey> {

}
	