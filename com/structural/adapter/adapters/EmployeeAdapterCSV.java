package com.structural.adapter.adapters;

import com.structural.adapter.employees.Employee;
import com.structural.adapter.employees.EmployeeCSV;

/**
 * See EmployeeAdapterLdap.java for notes on this pattern. This just serves as an example of having multiple adapters.
 */

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {
        this.instance = employeeFromCSV;
    }

    @Override
    public String getID() {
        return instance.getID() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return "ID: " + this.getID() + ", First name: " + this.getFirstName()+ ", Last name: " + this.getLastName() + ", Email: " + this.getEmail();
    }
}
