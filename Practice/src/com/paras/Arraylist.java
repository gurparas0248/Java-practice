package com.paras;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list=new ArrayList<>(10);

        list.add(69);
        list.add(65);
        list.add(90);
        list.add(100);

        System.out.println(list.contains(69));

        System.out.println(list);

    }
}
