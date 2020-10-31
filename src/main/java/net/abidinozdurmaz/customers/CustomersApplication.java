package net.abidinozdurmaz.customers;

import net.abidinozdurmaz.customers.model.Customer;
import net.abidinozdurmaz.customers.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomersApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CustomersApplication.class, args);
    }

    @Autowired
    CustomerRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Customer("Abidin","Özdurmaz","info@abidinozdurmaz.net"));
        repository.save(new Customer("Nur","Özdurmaz","nurozdurmaz@gmail.com"));
        repository.save(new Customer("Musa","Özdurmaz","musaozdurmaz@gmail.com"));
    }
}
