package com.trainingmug.employee.main;

import com.trainingmug.employee.domain.Employee;
import com.trainingmug.employee.domain.Developer;
import com.trainingmug.employee.domain.Designer;
import com.trainingmug.employee.service.Payroll;
import com.trainingmug.employee.service.PayrollImpl;
import com.trainingmug.employee.exception.InvalidBankAccountException;

public class Main {
    
    public static void main(String[] args) {
        
        // Create Payroll object
        Payroll payroll = new PayrollImpl();
        PayrollImpl payrollImpl = new PayrollImpl();
        
        // Problem Statement 1: Exception Handling with NullPointerException
        System.out.println("========== Problem Statement 1: Exception Handling ==========\n");
        
        try {
            Employee nullEmployee = null;
            payrollImpl.displayProfile(nullEmployee);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        System.out.println("\n========== Problem Statement 2: Custom Exceptions ==========\n");
        
        // Create Developer with valid bank account
        Developer dev1 = new Developer(1, "John Doe", "Developer", 5000, 200, 500, 200, 5.0f, "12345678901", 5);
        System.out.println("Developer 1 Profile:");
        dev1.displayProfile();
        
        System.out.println("\n--- Processing Salary for Developer with valid account ---");
        try {
            payroll.processSalary(dev1);
        } catch (InvalidBankAccountException e) {
            System.out.println("Caught InvalidBankAccountException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        // Create Designer with valid bank account
        System.out.println("\n");
        Designer designer1 = new Designer(2, "Jane Smith", "Designer", 4500, 150, 450, 150, 4.0f, "98765432109", 3);
        System.out.println("Designer 1 Profile:");
        designer1.displayProfile();
        
        System.out.println("\n--- Processing Salary for Designer with valid account ---");
        try {
            payroll.processSalary(designer1);
        } catch (InvalidBankAccountException e) {
            System.out.println("Caught InvalidBankAccountException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        // Create Developer with null bank account
        System.out.println("\n");
        Developer dev2 = new Developer(3, "Bob Wilson", "Developer", 5200, 220, 520, 220, 5.0f, null, 3);
        System.out.println("Developer 2 Profile (with null bank account):");
        dev2.displayProfile();
        
        System.out.println("\n--- Processing Salary for Developer with null account ---");
        try {
            payroll.processSalary(dev2);
        } catch (InvalidBankAccountException e) {
            System.out.println("Caught InvalidBankAccountException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        // Create Developer with 7-digit bank account
        System.out.println("\n");
        Developer dev3 = new Developer(4, "Alice Johnson", "Developer", 5100, 210, 510, 210, 5.0f, "1234567", 2);
        System.out.println("Developer 3 Profile (with 7-digit bank account):");
        dev3.displayProfile();
        
        System.out.println("\n--- Processing Salary for Developer with 7-digit account ---");
        try {
            payroll.processSalary(dev3);
        } catch (InvalidBankAccountException e) {
            System.out.println("Caught InvalidBankAccountException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}


