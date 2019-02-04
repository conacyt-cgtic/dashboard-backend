package mx.conacyt.cgtic.dashboard.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.conacyt.cgtic.dashboard.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}
