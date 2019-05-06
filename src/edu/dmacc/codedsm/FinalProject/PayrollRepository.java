package edu.dmacc.codedsm.FinalProject;

public interface PayrollRepository {
    void save(Integer employeeId, String name, Double netPay);
}
