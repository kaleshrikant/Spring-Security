package com.kaleshrikant.repository;

import com.kaleshrikant.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Shrikant Kale
 * @Date 26 Jul 2026
 */

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	Optional<Customer> findByEmail(String email);
}
