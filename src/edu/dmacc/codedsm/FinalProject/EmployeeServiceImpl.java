package edu.dmacc.codedsm.FinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private PayrollRepository repository;

    public EmployeeServiceImpl(PayrollRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> getEmployeeList(Map<Integer, String> employeeList) {
        List<Employee> workers = new ArrayList<>();

        for (Integer key : employeeList.keySet()) {
            workers.add(new Employee(key, employeeList.get(key).split(",")[0], 0.0, Double.parseDouble(employeeList.get(key).split(",")[1]), 0.0, 0.0));
        }
        return workers;
    }

    @Override
    public void updateEmployeeHours(List<Employee> employeeList, Integer id, Integer hours) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee e = employeeList.get(i);
            if (e.getID() == id) {
                e.setHoursWorked(hours);
                break;
            }
        }
    }

    @Override
    public void processPayroll(List<Employee> employeeList) {
        double netPay ;
        double grossPay ;
        for (int i = 0; i < employeeList.size(); i++) {
            Employee e = employeeList.get(i);
            grossPay = e.getHourlyRate() * e.getHoursWorked();
            e.setGrossPay(grossPay);
            netPay = e.getGrossPay() / e.getTaxRate();
            e.setNetPay(netPay);
            repository.save(e.getID(), e.getNames(), e.getNetPay());
        }

    }
}