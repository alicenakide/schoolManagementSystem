package com.company;

//This class is responsible for keeping track of student's fees, name, id and grade

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //Create student constructor
    //Fees for every student is going to be 30,000 per year


    public Student(int id, String name, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    //We are not going to alter student's name, id because they are locked fields

    // Used to update student's grade

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Used to update the fees paid

    public void payFees(int fees) {
        feesPaid +=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    // return student id

    public int getId() {
        return id;
    }
    //return the student name

    public String getName() {
        return name;
    }

    //return the student grade

    public int getGrade() {
        return grade;
    }

    //return the fees paid by student

    public int getFeesPaid() {
        return feesPaid;
    }

    //return total fees paid by the student

    public int getFeesTotal() {
        return feesTotal;
    }

     public int getRemaingFees(){
        return feesTotal - feesPaid;
     }

    @Override
    public String toString() {
        return "Name of student: " + name
                + ", total fees paid so far " +  feesPaid;
    }
}

