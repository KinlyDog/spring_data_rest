package spring.spring_data_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.spring_data_rest.entity.Employee;

import java.util.List;

public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {
}
