package com.company;

//Many teachers and students
//create arraylist becuse we dont know the number of students

import java.util.List;

public class School {

    private List <Teacher> teachers;
    private List <Student> students;
    private  static int totalMoneyEarned;
    private static int totalMoneySpent;


    // constructor arraylist of teachers and students in the school

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }


    //returns the list of teachers in the school

    public List<Teacher> getTeachers() {
        return teachers;
    }
     // adds a teacher to the school

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    //return the list of students in the school

    public List<Student> getStudents() {
        return students;
    }

    //add student to the school
    public void addStudents(Student student) {
        students.add(student);
    }

    //returns total money earned by the school

    public  int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // adds the  total money earned by the school

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    //returns total money spent by the school

    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //adds total money spent by the school

    public static void updateTotalMoneySpent(int moneySpent) {

        totalMoneyEarned -= moneySpent;
    }
}
