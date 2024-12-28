package com.meghasys.demo.designpatterns.builder;

import java.util.List;

public class StudentBuilder{
    private long id;
    private String name;
    private int age;
    private String fatherName; //Optional
    private String motherName;//Optional
    private String referredBy; //Optional
    private List<String> subjects;

    public StudentBuilder(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getMotherName() {
        return motherName;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public String getReferredBy() {
        return referredBy;
    }

    public StudentBuilder setReferredBy(String referredBy) {
        this.referredBy = referredBy;
        return this;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = subjects;
        return this;
    }

    public IStudent build(){
        return new EngineeringStudent(this);
    }
}
