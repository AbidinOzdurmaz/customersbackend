package net.abidinozdurmaz.customers.controller;

import net.abidinozdurmaz.customers.model.Customer;
import net.abidinozdurmaz.customers.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/customers")

public class CustomerController {

    private final CustomerRepository repository;

    @Autowired
    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping(produces = "application/json")
    public List<Customer> findAll(){
        return repository.findAll();
    }

    @GetMapping(value = "/{id}",produces = "application/json")
    public Customer findById(@PathVariable long id){
        return repository.findById(id);
    }

    @PostMapping(produces = "application/json")
    public void addCustomer(@RequestBody Customer customer){
        repository.save(customer);
    }
    @PutMapping(produces = "application/json")
    public void updateCustomer(@RequestBody Customer customer){
        repository.save(customer);
    }
    
    @DeleteMapping(value = "/{id}",produces = "application/json")
    public void deleteCustomerById(@PathVariable long id){
        repository.deleteById(id);
    }


}
