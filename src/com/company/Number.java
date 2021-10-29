package com.company;

public class Number {
    private byte b = 42;
    private char з = 'a';
    private short s = 1024;
    private int i = 50000;
    private float f = 5.67f;
    private double d = .1234;

    public double result(double c){
        return (f * b) + (i / c) - (d * s);
    }

    public void changeType(){
        int k = (int) (0.5 + b);
        System.out.println(k);
        double m = ((double)(s) + d);
        System.out.println(m);
    }

    public void add(){
        int a, b = 5, c = 7, d = 9;
        a = b ++ - c ++ + -- d;
        System.out.println(a);
    }

    public void infinity(){
        System.out.println(1d/0d);
        System.out.println(-1d/0d);
    }

    public void notANumber(){
        System.out.println(0.0/0.0);
        System.out.println(1e20f * 1e20f);
    }

    public void mathematics(){
        double х = 4;
        double у = Math.sqrt (х);
        System.out.println (у);
    }
}
