package com.trainingmug.employee.domain;

public class Designer extends Employee {
    
    private String designTool;
    private int noOfWebsites;
    
    public Designer() {
        super();
    }
    
    public Designer(long empId, String name, String designation, float grossSalary, 
                    float travellingAllowances, float federalTax, float stateTax, 
                    float incrementPercentage, String bankAccountNo, int noOfWebsites) {
        super(empId, name, designation, grossSalary, travellingAllowances, federalTax, stateTax, incrementPercentage, bankAccountNo);
        this.noOfWebsites = noOfWebsites;
    }
    
    public Designer(long empId, String name, String designation, float grossSalary, 
                    float travellingAllowances, float federalTax, float stateTax, 
                    float incrementPercentage, String bankAccountNo, String designTool) {
        super(empId, name, designation, grossSalary, travellingAllowances, federalTax, stateTax, incrementPercentage, bankAccountNo);
        this.designTool = designTool;
    }
    
    public String getDesignTool() {
        return designTool;
    }
    
    public void setDesignTool(String designTool) {
        this.designTool = designTool;
    }
    
    public int getNoOfWebsites() {
        return noOfWebsites;
    }
    
    public void setNoOfWebsites(int noOfWebsites) {
        this.noOfWebsites = noOfWebsites;
    }
    
    @Override
    public void displayProfile() {
        super.displayProfile();
        System.out.println("Design Tool: " + designTool);
        System.out.println("No of Websites: " + noOfWebsites);
        System.out.println("Bank Account No: " + getBankAccountNo());
    }
}


