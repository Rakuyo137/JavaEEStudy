package com.chendahao.extensdemo01;

public class Teacher extends Employee {
    public void teachenshow(){
        System.out.println(getName()+" "+getAge()+" "+getSalary()+"子类");
    }

}
