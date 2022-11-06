package com.rh05112.repository;

import com.rh05112.domain.Employees;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRepository extends MongoRepository<Employees, String> {


}
