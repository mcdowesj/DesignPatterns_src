package com.structural.adapterPattern.adapters;

import com.structural.adapterPattern.employees.Employee;
import com.structural.adapterPattern.employees.EmployeeLdap;

/**
 * This is pretty much it. We wrap the calls to the EmployeeLdap (this does not implement or extend anything we need)
 * in the methods that are exposed by the Employee interface. We call the methods we want to tie into the corresponding
 * interface (Employee). By just passing in our EmployeeLdap instance the client doesn't need to know about any of the
 * details happening behind the scenes.
 *
 * Don't over complicate the adapters and don't add functionality.
 */
public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getID() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    /**
     * This can be considered an element of the Decorator pattern as we are adding functionality and not just wrapping.
     * If we want to match the output we can copy the toString from our EmployeeDB class
     */
    public String toString() {
        return "ID: " + this.getID() + ", First name: " + this.getFirstName()+ ", Last name: " + this.getLastName() + ", Email: " + this.getEmail();
    }
}