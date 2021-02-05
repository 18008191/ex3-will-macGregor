package com.exercise.numbers;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfNumbers {
    private List<Integer> array;

    /**
     * One constructor should take an integer parameter that tells how big the array should be.
     * This should set all the values to zero.
     * @param length
     */
    public  ArrayOfNumbers(int length) {
        array = new ArrayList<Integer>(length);
        for (int i = 0; i < length; i++) {
            array.set(i, 0);
        }
    }
        /**
         * The other constructor should take an array of integers as an input parameter,
         * and set the internal storage equal to a copy of that array.
         * (Be careful here: do not just assign something like storage = input.
         * You will need to create a new array of the right size forstorage, and then loop through,
         * copying each array element across.)
         */
         public  ArrayOfNumbers(List<Integer> original){
            array = new ArrayList<>(original.size());
            for(int i = 0 ; i < original.size() ; i++){
                array.set(i,original.get(i));
            }
    }

    /**
     * The class will need an accessor method item() that takes an integer parameter saying which item to look at.
     */
    public Integer item(int index){
        return array.get(index);
    }

    /**
     * You will need a setter method called setItem() that takes two integer parameters.
     * The first one is the index of the item you are setting, and the second is the value you are putting in there.
     */
    public void setItem(int index, Integer value){
        array.set(index,value);
    }

    /**
     * Create a method max() that returns the largest item stored. You will need a loop for the implementation.
     */
    public Integer max(){
        Integer max =  array.get(0);
        for(int i = 1; i < array.size(); i++){
            if(array.get(i) > max ){
                max = array.get(i);
            }
        }
        return  max;
    }

    /**
     * Create a method equal() that takes two integer parameters saying which two elements to check for equality.
     */
    public boolean equal(int index1, int index2){
        return array.get(index1) == array.get(index2);
    }

    /**
     * Create a similar method called gcd() that returns the greatest common divisor of two elements.
     */
    public  Integer gcd(int index1, int index2){
        Integer num1 = array.get(index1);
        Integer num2 = array.get(index2);

        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num2;
    }

    /**
     * Returns the number of elements in within the array
     */
    public int count(){
        return array.size();
    }

    /**
     * Returns the sum of elements within array
     */
    public Integer sum(){
        Integer sum = 0 ;
        for(int i = 0 ; i < array.size() ; i ++){
            sum = sum + array.get(i);
        }
        return sum;
    }

    /**
     * Returns the average of the array
     * @return
     */
    public double average(){
        return sum()/count();
    }

    /**
     * scalarMultiply() takes a single integer parameter, and multiplies each element of the
     * array by that number.
     */
    public void scalarMultiply(Integer value){
        for(int i = 0 ; i < array.size() ; i++){
            array.set(i,array.get(i) * value);
        }
    }

    /**
     * addConstant() takes a single integer parameter and adds that to each element of the array.
     */
    public void addConstant(Integer value){
        for(int i = 0 ; i < array.size() ; i++){
            array.set(i,array.get(i) + value);
        }
    }
}
