package practicaljava;

import java.util.Scanner;

import Stack01.stack_in_array;
import array01.pusone;

class Employee{



    // Employee(int id, String name, double salary){
    //     id = id;
    //     name = name;
    //     salary = salary;
    // }
    // void display(){
    //     double da = salary * 15/100;
    //     double hra = salary *10/100;
    //     double gross_salary =  salary+da +hra;
    //     System.out.println("Eployee id : "+id);
    //     System.out.println("Employee name:"+name);
    //     System.out.println("Employee gross salary: "+gross_salary);



    // }

    public static void Employee1(){
       int id;
       String name;
       double salary;

       Scanner sc = new Scanner(System.in);
       Scanner sc1 = new Scanner(System.in);
       Scanner sc2 = new Scanner(System.in);
       System.out.println("enter Employee ID: ");
       id = sc.nextInt();
       System.out.println("enter Employee name: ");
       name = sc1.nextLine();
       System.out.println("enter Employee salary");
       salary = sc2.nextInt();

       double da = salary * 15/100;
     double hra = salary *10/100;
     double gross_salary =  salary+da +hra;
     System.out.println("Eployee id : "+id);
     System.out.println("Employee name:"+name);
     System.out.println("Employee gross salary: "+gross_salary);



            

    }
    
}
public class pr14 {
    public static void main(String[] args) {

        Employee em = new Employee();

        em.Employee1();
        

        
    }
}
