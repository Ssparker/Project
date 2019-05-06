package edu.dmacc.codedsm.FinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeControllerImpl implements EmployeeController {
    private EmployeeService service;

    public EmployeeControllerImpl(EmployeeService service) {
        this.service = service;
    }

    @Override
    public EmployeeView showEmployees(Map<Integer, String> employees, String input) {
        boolean onStartup = false;
        List<Employee> knownEmployees = service.getEmployeeList(employees);;
        while(!onStartup) {
            if (input.equals("l")) {

                knownEmployees = service.getEmployeeList(employees);
                onStartup = true;
            } else if (input.equals("u")) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter the employee ID to update: ");
                String inputId = in.next();
                if (inputId != null ) {
                    Scanner i = new Scanner(System.in);
                    System.out.print("update the hours employee worked: ");
                    int hours= i.nextInt();
                    service.updateEmployeeHours(knownEmployees, Integer.parseInt(inputId),hours);

                } else{
                    System.out.println("Invalid input");
                }
                onStartup = true;
            }
            service.processPayroll(knownEmployees);

        }

        return new EmployeeConsoleView(knownEmployees);
    }
}
