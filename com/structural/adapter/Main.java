package com.structural.adapter;

import com.structural.adapter.adapters.EmployeeAdapterLdap;
import com.structural.adapter.client.EmployeeClient;
import com.structural.adapter.employees.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Convert the interface of a class into another interface clients expect. The AdapterDemo pattern is used to wrap a needed
 * class with one that implements a required interface. Adapters are commonly known as Wrappers.
 *
 * The AdapterDemo Pattern can be used when :
 *      - You want to use an existing class, but its interface does not match the one your require (connecting new code
 *        to legacy code, specific api, etc).
 *      - You want to create a reusable class that cooperates with unrelated or unforeseen classes (they may not share
 *        the same interface)
 *      - You need to use several existing subclasses, but it's not practical to adapt their interface by subclassing
 *        evey one
 *
 * Remember the O/C Principal - Modules should be open to extension, but closed to modification.
 *
 */
public class Main {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(Main.class.getName());
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        logger.info(employees.toString());
    }
}
