package mx.conacyt.cgtic.dashboard.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.conacyt.cgtic.dashboard.core.Calculator;
import mx.conacyt.cgtic.dashboard.model.Customer;
import mx.conacyt.cgtic.dashboard.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository repository;
    
    @Override
    public Customer insert(Customer customer) {
        Customer _customer = repository.save(new Customer(customer.getName(), customer.getAge()));
        return _customer;
    }

    @Override
    public Optional<Customer> update(long id, Customer customer) {
        System.out.println("Update Customer with ID = " + id + "...");
        Optional<Customer> customerData = repository.findById(id);
        return customerData;
    }

    @Override
    public void delete(long id) {
        System.out.println("Delete Customer with ID = " + id + "...");
        repository.deleteById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        System.out.println("Get all Customers...");
        List<Customer> customers = new ArrayList<>();
        repository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public List<Customer> findByAge(int age) {
        List<Customer> customers = repository.findByAge(age);
        return customers;
    }

    @Override
    public long computeFactLen(int n) {
        Calculator c = new Calculator();
        return c.computeFactLen(n);
    }

    //ok
}
