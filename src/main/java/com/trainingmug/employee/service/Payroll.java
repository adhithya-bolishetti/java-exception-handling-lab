package com.trainingmug.employee.service;

import com.trainingmug.employee.domain.Employee;
import com.trainingmug.employee.exception.InvalidBankAccountException;

public interface Payroll {
    
    /*
    void displayProfile(String department);
    */
    
    double calculateSalary(Employee employee);
    
    boolean processSalary(Employee employee) throws InvalidBankAccountException;
}