package com.Payment.Zappay.repository;

import com.Payment.Zappay.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
