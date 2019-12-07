package com.ana.java.exercise;

import java.util.Scanner;

public class Array {
   private int[] array;
   private int sizeArray;
   private Scanner reader;

   // constructor by defect.
   public Array() {
      this.array = new int[0];
      this.sizeArray = 0;
      this.reader = new Scanner(System.in);
   }

   public int getSizeArrayFromUser() {
      System.out.print("Please enter the desired lenght of the array here: ");
      return reader.nextInt();
   }

   /* Steps:
    1 Read size from user,
    2 Save it in SizeArray,
    3 Create temporal array,
    4 Fill out the array.
   */
   public void arrayMaker() {
      setSizeArray(getSizeArrayFromUser());
      int[] tempArray = new int[this.getSizeArray()];
      System.out.println("Please enter " + sizeArray + " intergers:");
      for (int i = 0; i < getSizeArray(); i++){
         System.out.print( " PLease intruduce the value: " + (i+1)+ " ");
         int intergerFronUser = reader.nextInt();
         tempArray[i]= intergerFronUser;
      }
      setArray(tempArray);
   }

   //Example of method overloading, an array has been created as parameter in order to avoid potential modification of the user array.
   public void arrayPrinter() {
      // Reutilizacion de codigo: arrayPrinter(getArray())
      String arrayToString = arrayPrinter(getArray());
      System.out.println("Your array is made of: " + arrayToString);
   }

    /* Steps:
   1 Initialize string to return it,
   2 For loop to concatenate elements of array in String,
   3 Return final string.
    */
   public static String arrayPrinter(int[] arrayToPrint) {
      String arrayToString = "[";
      for (int i = 0; i < arrayToPrint.length; i++){
         arrayToString = arrayToString + " " + arrayToPrint[i];
      }
      arrayToString = arrayToString + "]";
      return arrayToString;
   }

/* Steps:
   1. Create a new variable to assign maximum value,
   2. Compare the array elements,
   3. Return max value.
 */
   public int getMaxNumber() {
      int max = array[0];
      for (int i= 0; i < array.length; ++i) {
         int elementToCheck = array[i];
         if (max < elementToCheck) {
            max = elementToCheck;
         }
      }
      return max;
   }

   public int getMinNumber() {
      int min = array[0];
      for (int i= 0; i < array.length; ++i) {
         int elementToCheck = array[i];
         if (min > elementToCheck) {
            min = elementToCheck;
         }
      }
      return min;
   }

   // TODO
    public int [] getOrderedArrayDescendent() {
       return new int[0];
    }

    public int [] getOrderedArrayAscendent() {
       return new int[0];
    }

   public int getPrimeIntergers() {
      return 0;
   }
   public int getIntergersRepetiedAndTimesOfRepetition() {
      return 0;
   }

   // Irrelevant methods below:
   public int getSizeArray() {
      return sizeArray;
   }
   public void setSizeArray(int sizeArray) {
      this.sizeArray = sizeArray;
   }
   public int[] getArray() {
      return array;
   }
   public void setArray(int[]array) {
      this.array = array;
   }
}




