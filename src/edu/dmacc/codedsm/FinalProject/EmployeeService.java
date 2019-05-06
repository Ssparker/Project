package edu.dmacc.codedsm.FinalProject;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

     List<Employee> getEmployeeList(Map<Integer, String> employeeList);
     void updateEmployeeHours(List<Employee> employeeList, Integer id, Integer hours);
     void processPayroll(List<Employee> employeeList);

}
