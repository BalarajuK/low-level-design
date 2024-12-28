package com.meghasys.demo.designpatterns.builder;

import java.util.List;

public class TestBuilderPattern {

    public static void main(String[] args) {
        Administration test = new Administration();
        List<IStudent> students = test.buildStudents();

        for (IStudent student : students){
            print(student);
        }
    }

    private static void print(IStudent student){
        System.out.println("-------------Student------------");
        System.out.println("Id: "+student.getId());
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println("Subjects:");
        for (String sub : student.getSubjects()){
            System.out.print(sub+", ");
        }
        System.out.println();
    }
}
