package net.abidinozdurmaz.customers.repository;

import net.abidinozdurmaz.customers.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findById(long id);
}
