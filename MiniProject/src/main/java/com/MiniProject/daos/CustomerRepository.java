package com.MiniProject.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.MiniProject.models.Customer;
@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Long> {

}
