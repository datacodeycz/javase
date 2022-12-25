package com.yuan.collection.map;

import java.util.Objects;

public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
    public void Student(){

    }

    //重写equals方法

    //*** 
    public boolean equals(Object obj){
        if(obj == null || obj instanceof Student) return false;
        if(obj == this) return true;
        Student student = (Student) obj;
        if(this.name.equals(name)) return true;
        return false;

    }

    //重写hashCode方法

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

