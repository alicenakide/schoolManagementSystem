package com.company;

import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

     Teacher Lizzy = new Teacher(1, "Lizzy", 503);
     Teacher Alice = new Teacher(2, "Alice",700);
     Teacher Norah = new Teacher(3 , "Norah", 603);


        List <Teacher> teacherList = new ArrayList<>();

        teacherList.add(Lizzy);
        teacherList.add(Alice);
        teacherList.add(Norah);


     Student tammy = new Student(1, "tammy", 4);
     Student melisa = new Student(2 , "melisa", 12);
     Student mike = new Student(3 ,"mike", 5);

        List <Student> studentList = new ArrayList<>();

        studentList.add(tammy);
        studentList.add(melisa);
        studentList.add(mike);


        School ghs = new School(teacherList, studentList);


        tammy.payFees(1000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        melisa.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());


        System.out.println("Making GHS Pay Salary");
        Lizzy.receiveSalary(Lizzy.getSalary());

        System.out.println("GHS has paid " + Lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        Alice.receiveSalary(Alice.getSalary());

        System.out.println("GHS has paid " + Alice.getName() + " and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(tammy);

        Alice.receiveSalary(Alice.getSalary());

        System.out.println(Alice);
    }
}


// Create school management system to maintain information about students, teachers and funds
// Money management system for a school
//Keep track of: students total fees, fees already paid, teachers salary

// School Object

//Teachers
//Students
//Total money earned
//Total money spent


//Teacher Object

//Teacher ID
//Teacher Name
//Salary amount


//Student Object

//Student ID
//Student Name
//Student Grade
//Fees paid
//Fees Total





