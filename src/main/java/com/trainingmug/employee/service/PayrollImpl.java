package com.trainingmug.employee.service;

import com.trainingmug.employee.domain.Employee;
import com.trainingmug.employee.exception.InvalidBankAccountException;

public class PayrollImpl implements Payroll {

    public void displayProfile(Employee employee) {
        try {
            if (employee == null) {
                System.out.println("Employee object shouldn't be null");
                return;
            }
            employee.displayProfile();
        } catch (NullPointerException e) {
            System.out.println("Employee object shouldn't be null");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Override
    public double calculateSalary(Employee employee) {
        try {
            if (employee == null) {
                throw new NullPointerException("Employee object cannot be null");
            }
            float grossSalary = employee.getGrossSalary();
            float travellingAllowances = employee.getTravellingAllowances();
            float federalTax = employee.getFederalTax();
            float stateTax = employee.getStateTax();
            
            double netSalary = grossSalary + travellingAllowances - federalTax - stateTax;
            return netSalary;
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public boolean processSalary(Employee employee) throws InvalidBankAccountException {
        try {
            if (employee == null) {
                throw new NullPointerException("Employee object cannot be null");
            }
            
            String bankAccountNo = employee.getBankAccountNo();
            
            if (bankAccountNo == null || bankAccountNo.length() != 11) {
                throw new InvalidBankAccountException(
                    "Hey " + employee.getName() + ", Invalid Bank Account, Please provide the proper Bank Account Number to process your salary.."
                );
            }
            
            double netSalary = calculateSalary(employee);
            System.out.println("Net Salary : $" + netSalary + " is successfully processed to " + bankAccountNo);
            return true;
            
        } catch (InvalidBankAccountException e) {
            throw e;
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            throw new InvalidBankAccountException("Employee object is null");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            throw new InvalidBankAccountException("An error occurred while processing salary");
        }
    }
}


