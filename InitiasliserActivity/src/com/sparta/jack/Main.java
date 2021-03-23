package com.sparta.jack;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Integer i1  = 1;
        String s1 = "String";
        System.out.println(s1.hashCode());
        Integer i2 = -1808118735;
        System.out.println(i2.hashCode());
        System.out.println(s1.equals(i2));

        System.out.println(s1.concat("String"));
        System.out.println(s1);


        System.out.println(i1+1);
        System.out.println(i1);




}}

