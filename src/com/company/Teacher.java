package com.company;

public class Teacher{

    //This class is responsible for keeping track of teacher's information

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    // Constructor responsible to create the teacher object

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;
    }
    //return teacher id
    public int getId() {
        return id;
    }
    //return teacher name
    public String getName() {
        return name;
    }
    //return salary of the teacher
    public int getSalary() {
        return salary;
    }

    //Setter used to update the salary

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary){

     salaryEarned += salary;
     School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Name of teacher is : " + name +
                ", and the total amount spent on him/her  $" + salaryEarned;

    }
}



