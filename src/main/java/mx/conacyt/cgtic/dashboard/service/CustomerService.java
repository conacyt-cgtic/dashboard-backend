package mx.conacyt.cgtic.dashboard.service;

import java.util.List;
import java.util.Optional;

import mx.conacyt.cgtic.dashboard.model.Customer;

public interface CustomerService {
    Customer insert(Customer customer);
    Optional<Customer> update(long id, Customer customer);
    void delete(long id);
    List<Customer> getAllCustomers();
    List<Customer> findByAge(int age);
}
