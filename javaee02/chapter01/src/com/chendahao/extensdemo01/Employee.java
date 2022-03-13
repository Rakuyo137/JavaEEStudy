package com.chendahao.extensdemo01;

public class Employee {
    private String name ;
    private int age;
    private int salary;

    public void show() {
        System.out.println(name +" "+age +" "+salary+"父类");
    }

    public Employee() {
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //生成get set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}
