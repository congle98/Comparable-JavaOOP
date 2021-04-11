package test;

import java.sql.SQLOutput;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ComparableCircle circle[]= new ComparableCircle[5];
        circle[0]= new ComparableCircle(5);
        circle[1]= new ComparableCircle(2);
        circle[2]= new ComparableCircle(7);
        circle[3]= new ComparableCircle(5,"red",true);
        circle[4]= new ComparableCircle(5,"blue",false);
        System.out.println("Mảng trước khi sắp xếp");
        for (ComparableCircle c: circle
             ) {
            System.out.println(c);
        }
        Arrays.sort(circle);
        System.out.println("Mảng sau khi sắp xếp");
        for (ComparableCircle c: circle
        ) {
            System.out.println(c);
        }
    }
}