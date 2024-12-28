package com.meghasys.demo.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Administration {

    public List<IStudent> buildStudents() {
        List<IStudent> students = new ArrayList<>();
        students.add(createEngineeringStudent());
        students.add(createMedicalStudent());
        return students;
    }

    private IStudent createEngineeringStudent() {
        StudentBuilder builder = new StudentBuilder(1, "A", 25);
        return builder.setFatherName("AA")
                .setMotherName("BB")
                .setSubjects(List.of("Maths", "English", "Science"))
                .build();
    }

    private IStudent createMedicalStudent() {
        StudentBuilder builder = new StudentBuilder(2, "B", 25);
        return builder.setFatherName("AAA")
                .setMotherName("BBB")
                .setSubjects(List.of("Biology", "English", "Science"))
                .build();
    }
}
