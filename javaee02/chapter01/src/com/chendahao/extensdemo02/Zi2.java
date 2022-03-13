package com.chendahao.extensdemo02;

public class Zi2 extends Fu2 {
    int num = 20;

    //就近原则
    public void show() {
        int num = 10;
        System.out.println(num);
        System.out.println(num);

    }
    // this super 关键字
    public void show2() {
        int num = 10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
