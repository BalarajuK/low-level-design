package com.meghasys.demo.designpatterns.builder;

import java.util.List;

public interface IStudent {

    long getId();

    String getName();
    int getAge();


    String getFatherName();

    String getMotherName();
    String getReferredBy();

    List<String> getSubjects();
}
