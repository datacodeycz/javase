package com.yuan.reflect.bean;

import java.util.Objects;

public class Vip {


    int no;
    String name;
    String birth;
    boolean sex;

    public Vip(){

    }
    public Vip(int no) {
        this.no = no;
    }

    public Vip(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Vip(int no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    public Vip(int no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vip vip = (Vip) o;
        return no == vip.no && sex == vip.sex && Objects.equals(name, vip.name) && Objects.equals(birth, vip.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name, birth, sex);
    }
}
