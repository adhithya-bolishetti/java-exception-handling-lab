package com.trainingmug.employee.domain;

public class Developer extends Employee {
    
    private String programmingLanguage;
    private int noOfProjects;
    
    public Developer() {
        super();
    }
    
    public Developer(long empId, String name, String designation, float grossSalary, 
                     float travellingAllowances, float federalTax, float stateTax, 
                     float incrementPercentage, String bankAccountNo, int noOfProjects) {
        super(empId, name, designation, grossSalary, travellingAllowances, federalTax, stateTax, incrementPercentage, bankAccountNo);
        this.noOfProjects = noOfProjects;
    }
    
    public Developer(long empId, String name, String designation, float grossSalary, 
                     float travellingAllowances, float federalTax, float stateTax, 
                     float incrementPercentage, String bankAccountNo, String programmingLanguage) {
        super(empId, name, designation, grossSalary, travellingAllowances, federalTax, stateTax, incrementPercentage, bankAccountNo);
        this.programmingLanguage = programmingLanguage;
    }
    
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    
    public int getNoOfProjects() {
        return noOfProjects;
    }
    
    public void setNoOfProjects(int noOfProjects) {
        this.noOfProjects = noOfProjects;
    }
    
    @Override
    public void displayProfile() {
        super.displayProfile();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("No of Projects: " + noOfProjects);
        System.out.println("Bank Account No: " + getBankAccountNo());
    }
}


