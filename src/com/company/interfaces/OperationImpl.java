package com.company.interfaces;


import com.company.models.Employee;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class OperationImpl implements Operation{

    Scanner sc = new Scanner(System.in);


    Employee employee1 = new Employee("Вадим" , 23);
    Employee employee2 = new Employee("Виктор" , 25);
    Employee employee3 = new Employee("Ваня" , 27);
    Employee employee4 = new Employee("Илья" , 21);
    Employee employee5 = new Employee("Алексей" , 30);

    ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(employee1,employee2,employee3,employee4,employee5));

    @Override
    public Employee[] getSort() {
        int sort = 0;
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = 0; j < employees.size() - 1; j++) {
                if (employees.get(j).getAge() > employees.get(j + 1).getAge()) {
                    sort = employees.get(j + 1).getAge();
                    employees.get(j + 1).setAge(employees.get(j).getAge());
                    employees.get(j).setAge(sort);
                }
            }
        }

        return null;
    }


    @Override
    public Employee[] getInfo() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("ФИО: " + employees.get(i).getName() + ", возраст: " + employees.get(i).getAge());
        }
        System.out.println();
        return null;
    }
}
