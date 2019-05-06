package edu.dmacc.codedsm.FinalProject;

import java.util.List;

public class EmployeeConsoleView implements EmployeeView {
    private Employee employee;
    private List<Employee> employees;

    public EmployeeConsoleView(Employee employee) {
        this.employee = employee;
    }

    public EmployeeConsoleView(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void render() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee Description: " + employees.get(i));
        }
    }
}
