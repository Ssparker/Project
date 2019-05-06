package edu.dmacc.codedsm.FinalProject;

public class Employee {
    private Integer ID;
    private String names;
    private double hoursWorked;
    private double hourlyRate;
    private double netPay;
    private double grossPay;
    private final double taxRate = 1.2;

    public Employee(Integer ID, String names, double hoursWorked, double hourlyRate, double netPay, double grossPay) {
        this.ID = ID;
        this.names = names;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.netPay = netPay;
        this.grossPay = grossPay;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNetPay() {
        return netPay;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", names='" + names + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", netPay=" + netPay +
                ", grossPay=" + grossPay +
                ", taxRate=" + taxRate +
                '}';
    }
}
