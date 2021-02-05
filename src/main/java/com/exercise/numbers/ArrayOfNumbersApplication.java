package com.exercise.numbers;
import java.util.Arrays;

public class ArrayOfNumbersApplication {
    public static void main(String [] args){
        //Initialize array of numbers
        System.out.println("Initialize array of numbers");
        ArrayOfNumbers nums = new ArrayOfNumbers(7);
        nums.print();

       //setItem
        System.out.println("setItem");
        nums.setItem(0,13);
        nums.print();

        //getItem
        System.out.println(String.format("Index 0 value: %s",nums.item(0)));

        //addConstant
        System.out.println("addConstant(3)");
        nums.addConstant(3);
        nums.print();

        //scalarMultiply
        System.out.println("scalarMultiply(2)");
        nums.scalarMultiply(2);
        nums.print();

        //second constructor
        System.out.println("Second constructor with input array");
        nums = new ArrayOfNumbers(Arrays.asList(1,7,8,9,13,0,1,2,4));
        nums.print();

        //count
        System.out.println(String.format("count: %s", nums.count()));

        //equal
        System.out.println(String.format("equal 0. with 6. : %s", nums.equal(0,6)));

        System.out.println(String.format("equal 0. with 5. : %s", nums.equal(0,5)));

        //max
        System.out.println(String.format("max: %s",nums.max()));

        //sum
        System.out.println(String.format("sum: %s",nums.sum()));

        //avg
        System.out.println(String.format("average: %s ", nums.average()));

        //gcd
        System.out.println(String.format("gcd: %s",nums.gcd(2,8)));
    }
}
