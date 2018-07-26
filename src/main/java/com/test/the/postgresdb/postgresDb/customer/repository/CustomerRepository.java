package com.test.the.postgresdb.postgresDb.customer.repository;

import com.test.the.postgresdb.postgresDb.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer,UUID> {
}
