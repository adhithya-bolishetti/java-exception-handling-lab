package com.trainingmug.employee.domain;

public class Employee {
    
    private long empId;
    private String name;
    private String designation;
    private float grossSalary;
    private float travellingAllowances;
    private float federalTax;
    private float stateTax;
    private float incrementPercentage;
    private String bankAccountNo;
    
    private static String companyName;
    private static String companyContactNo;
    private static int employeeCount = 0;
    
    public Employee() {
        employeeCount++;
    }
    
    public Employee(long empId, String name, String designation, float grossSalary, 
                    float travellingAllowances, float federalTax, float stateTax, 
                    float incrementPercentage, String bankAccountNo) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.grossSalary = grossSalary;
        this.travellingAllowances = travellingAllowances;
        this.federalTax = federalTax;
        this.stateTax = stateTax;
        this.incrementPercentage = incrementPercentage;
        this.bankAccountNo = bankAccountNo;
        employeeCount++;
    }
    
    public long getEmpId() {
        return empId;
    }
    
    public void setEmpId(long empId) {
        this.empId = empId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public float getGrossSalary() {
        return grossSalary;
    }
    
    public void setGrossSalary(float grossSalary) {
        this.grossSalary = grossSalary;
    }
    
    public float getTravellingAllowances() {
        return travellingAllowances;
    }
    
    public void setTravellingAllowances(float travellingAllowances) {
        this.travellingAllowances = travellingAllowances;
    }
    
    public float getFederalTax() {
        return federalTax;
    }
    
    public void setFederalTax(float federalTax) {
        this.federalTax = federalTax;
    }
    
    public float getStateTax() {
        return stateTax;
    }
    
    public void setStateTax(float stateTax) {
        this.stateTax = stateTax;
    }
    
    public float getIncrementPercentage() {
        return incrementPercentage;
    }
    
    public void setIncrementPercentage(float incrementPercentage) {
        this.incrementPercentage = incrementPercentage;
    }
    
    public String getBankAccountNo() {
        return bankAccountNo;
    }
    
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }
    
    public static String getCompanyName() {
        return companyName;
    }
    
    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }
    
    public static String getCompanyContactNo() {
        return companyContactNo;
    }
    
    public static void setCompanyContactNo(String companyContactNo) {
        Employee.companyContactNo = companyContactNo;
    }
    
    public static int getEmployeeCount() {
        return employeeCount;
    }
    
    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }
    
    public void displayProfile() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Travelling Allowances: " + travellingAllowances);
        System.out.println("Federal Tax: " + federalTax);
        System.out.println("State Tax: " + stateTax);
        System.out.println("Increment Percentage: " + incrementPercentage);
        System.out.println("Bank Account No: " + bankAccountNo);
    }
}


