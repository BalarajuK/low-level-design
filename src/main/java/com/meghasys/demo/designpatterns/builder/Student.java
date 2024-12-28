package com.meghasys.demo.designpatterns.builder;

import java.util.List;

public class Student implements IStudent{
    private final long id;
    private final String name;
    private final int age;
    private String fatherName; //Optional
    private String motherName;//Optional
    private String referredBy; //Optional
    private final List<String> subjects; //Optional

    public Student(StudentBuilder builder) {
        this.id = builder.getId();
        this.name =builder.getName();
        this.age = builder.getAge();
        this.subjects = builder.getSubjects();
    }

    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getFatherName() {
        return fatherName;
    }

    @Override
    public String getMotherName() {
        return motherName;
    }

    @Override
    public String getReferredBy() {
        return referredBy;
    }

    @Override
    public List<String> getSubjects() {
        return subjects;
    }
}
