package com.book.store.bookstorecustomer.dao;

import com.book.store.bookstorecustomer.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer, Long>{


}
