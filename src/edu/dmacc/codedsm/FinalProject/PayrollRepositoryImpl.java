package edu.dmacc.codedsm.FinalProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PayrollRepositoryImpl implements PayrollRepository {
    private PrintWriter out = null;
    @Override
    public void save(Integer employeeId , String name, Double netPay) {
        try {
            out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("payroll_results.txt", true)));
            out.println(employeeId+" "+name+" "+netPay);

        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }
}
