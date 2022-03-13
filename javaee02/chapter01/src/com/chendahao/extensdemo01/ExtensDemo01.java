package com.chendahao.extensdemo01;

public class ExtensDemo01 {
    /**
     * 继承 :向上抽取多个类中的共性,子类通过extens关键字继承父类
     */
    public static void main(String[] args) {
        Employee employee = new Employee("abc",33,8000);
        employee.show();
        Teacher teacher = new Teacher();
        teacher.setName("张三");
        teacher.setAge(41);
        teacher.setSalary(2000);
        teacher.show();
        teacher.teachenshow();



    }
}
