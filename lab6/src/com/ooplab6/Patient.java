package com.ooplab6;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {
    String id;
    FullName name;
    Gender gender;
    Date birthDate;
    int age;
    Date accepted;
    History sickness;
    ArrayList<String> precisions;
    ArrayList<String> allergies;
    ArrayList<String> specialReqs;

    ArrayList<OperationsStaff> operationsStaffs;
}
