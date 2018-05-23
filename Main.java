package com.company;

import java.util.Scanner;

class Circle{
    private int xc;
    private int yc;
    private int r1;
    private int r2;
    public Circle(){
        Scanner in = new Scanner(System.in);
        System.out.print("r1:\t");
        if(in.hasNextInt()) r1=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("r2:\t");
        if(in.hasNextInt()) r2=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("xc:\t");
        if(in.hasNextInt()) xc=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("yc:\t");
        if(in.hasNextInt()) yc=in.nextInt();
        else System.out.println("Введены неверные значения");
    }

    public void lab51(){
        double length=2*Math.PI*r1;
        System.out.print("Длинна окружности:\t");
        System.out.println(length);
    }

    public int[] lab52(){
        xc=(int)Math.random()*198-99;
        yc=(int)Math.random()*198-99;
        return new int[] {xc,yc};
    }

    public void lab54() {
        int circle1[] = lab52();
        int circle2[] = lab52();
        double g = Math.sqrt(Math.pow((circle1[0] - circle2[0]), 2) + Math.pow((circle1[1] - circle2[1]), 2));
        System.out.println("Центр 1:\t(" + Integer.toString(circle1[0]) + ";" + Integer.toString(circle1[1]) + ")");
        System.out.println("Центр 2:\t(" + Integer.toString(circle2[0]) + ";" + Integer.toString(circle2[1]) + ")");
        System.out.println("Расстояние от центров:\t" + Double.toString(g));
        if (g <= (r1 + r2) || g >= (r1 - r2)) System.out.println("Соприкасаются");
        else System.out.println("Не соприкасаются");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle a = new Circle();
        a.lab51();
        a.lab52();
        a.lab54();
    }
}
