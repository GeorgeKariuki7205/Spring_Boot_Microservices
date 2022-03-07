package com.microservices.customer.Repository;

import com.microservices.customer.Model.CustomerMicroServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMicroserviceRepository extends JpaRepository<CustomerMicroServiceModel,Integer> {
}
