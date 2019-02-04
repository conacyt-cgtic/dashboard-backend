package mx.conacyt.cgtic.dashboard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.conacyt.cgtic.dashboard.model.Customer;
import mx.conacyt.cgtic.dashboard.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	CustomerService service;

	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
	    return service.getAllCustomers();
	}

	@PostMapping("/customer")
	public Customer postCustomer(@RequestBody Customer customer) {
	    return service.insert(customer);
	}

	@DeleteMapping("/customer/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id) {
	    service.delete(id);
	    return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}

	@GetMapping("customers/age/{age}")
	public List<Customer> findByAge(@PathVariable int age) {
	    return service.findByAge(age);
	}

	@PutMapping("/customer/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
	    Optional<Customer> customerData = service.update(id, customer);
        if (customerData.isPresent()) {
            Customer _customer = customerData.get();
            _customer.setName(customer.getName());
            _customer.setAge(customer.getAge());
            _customer.setActive(customer.isActive());
            return new ResponseEntity<>(service.insert(_customer), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
}
