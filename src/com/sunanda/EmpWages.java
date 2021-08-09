package com.sunanda;

import java.lang.invoke.SwitchPoint;
//Solving using switch case
public class EmpWages {
    public static void main(String[] args) {

        System.out.println("The hour is 8 and wages is 20");
        int full_time_employee=1;
        int part_time_employee=0;
        int i;
        int work_hrs;
        int result=0;
        int emp;
        int emp_hrs=0;
        for(i=0;i<=20;i++) {
            emp = (int) (Math.random() * 10) % 2;
            switch (emp) {
                case 1:
                    work_hrs=(int)(Math.random() * 10) % 9;
                    result=result+work_hrs;
                    System.out.println("Work time "+work_hrs);
                    break;
                case 0:
                    work_hrs=(int)(Math.random() * 10) % 9;
                    result=result+work_hrs;
                    System.out.println("Work time "+work_hrs);
                    break;
            }
        }
        System.out.println("Total working hrs = "+result);
        int total_wages= result * 20;
        System.out.println("The wages of the employee is = "+total_wages);
    }
}