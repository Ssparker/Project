package edu.dmacc.codedsm.FinalProject;

import java.util.List;
import java.util.Map;

public interface EmployeeController {

    EmployeeView showEmployees(Map<Integer, String> employees, String input);
}
