/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.inheritance.override;

public class Manager extends Employee {
    @Override
    public long getSalary() {
        return 200;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        System.out.println(employee.getSalary());       // 100
        System.out.println(manager.getSalary());        // 200
    }
}
