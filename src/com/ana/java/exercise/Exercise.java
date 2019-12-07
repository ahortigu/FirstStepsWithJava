package com.ana.java.exercise;

public class Exercise {

    public static void main(String[] args) {
/*
Ejemplo de metodo estatico - no se necesita crear un objecto para invocarlo
 */
        int[] meLoInvento = new int[]{3, 4, 5, 5};
        int[] meLoInvento2 = {3, 4, 5, 6};
        System.out.println("T1 -> " + Array.arrayPrinter(meLoInvento));
        System.out.println("T2 -> " + Array.arrayPrinter(meLoInvento2));




        Array array = new Array();
        array.arrayMaker();
        array.arrayPrinter();
        System.out.println("Max value: " + array.getMaxNumber());
        System.out.println("Min value: " + array.getMinNumber());
        int[] arrayDESC = array.getOrderedArrayDescendent();
        System.out.println("Array ordered DESC -> " + Array.arrayPrinter(arrayDESC));
        int[] arrayASC = array.getOrderedArrayAscendent();
        System.out.println("Array ordered ASC -> " + Array.arrayPrinter(arrayASC));
    }
}
