package com.sunanda;

import java.lang.invoke.SwitchPoint;

public class EmpWages {
    public static void main(String[] args) {

        System.out.println("The hour is 8 and wages is 20");
        int full_time_employee=1;
        int part_time_employee=0;
        int emp;
        int emp_hrs=0;
        emp=(int)(Math.random()*10)%2;
        switch(emp)
        {
            case 1:
                System.out.println("Employee is full time ");
                emp_hrs=8;
                break;
            case 0:
                System.out.println("Employee is part time ");
                emp_hrs=4;
                break;
        }
        int total_wages= emp_hrs * 20;
        System.out.println("The wages of the employee is = "+total_wages);
    }
}