package com.aish.java8._09streams;

import java.util.*;
import java.util.stream.Collectors;


class Student{
          private String name;
          private String age;
          private String sName;

    public Student() {
    }

    public Student(String name, String age, String sName) {
        this.name = name;
        this.age = age;
        this.sName = sName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}

class Student2{

    private String name;
    private String age;
    private String sName;
    private String education;

    public Student2() {
    }

    public Student2(String name, String age, String sName, String education) {
        this.name = name;
        this.age = age;
        this.sName = sName;
        this.education = education;
    }

    public Student2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}

public class AddInObject {
    public static void main(String[] args) {
        List<Student> l1= new ArrayList<>();
        List<Student2> l2=new ArrayList<>();
        l1.add(new Student("shubhi","2","dongre"));
        l1.add(new Student("aish","6","jorve"));
        l1.add(new Student("mahesh","9","bansode"));

        String[] names=l1.stream().map(Student::getName).collect(Collectors.toList()).toArray(new String[l1.size()]);
        String sNames[]=l1.stream().map(Student::getsName).collect(Collectors.toList()).toArray(new String[l1.size()]);
        String ages[]=l1.stream().map(Student::getAge).collect(Collectors.toList()).toArray(new String[l1.size()]);

        String documents[]={"education certificate","payment slip","graduation certificate","others"};

        for (int i=0;i<names.length;i++){
            l2.add(new Student2(names[i],sNames[i],ages[i],documents[i]));
        }
        System.out.println(l2);
    }
}
