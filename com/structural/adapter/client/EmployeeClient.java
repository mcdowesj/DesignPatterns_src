package com.structural.adapter.client;

import com.structural.adapter.employees.Employee;
import com.structural.adapter.adapters.EmployeeAdapterCSV;
import com.structural.adapter.adapters.EmployeeAdapterLdap;
import com.structural.adapter.employees.EmployeeCSV;
import com.structural.adapter.employees.EmployeeDB;
import com.structural.adapter.employees.EmployeeLdap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Doe", "john@doe.com");
        employees.add(employeeFromDB);

        //Will not work! This is where the adapter comes into play!
        //Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("4567", "Jane", "Doe", "jane@doe.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("8910,Jimmy,Doe,jimmy@doe.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;

    }

}
