package com.ana.java.exercise;

import java.util.Scanner;

public class Array {
   private int[] array;
   private int sizeArray;
   private Scanner reader;

   // constructor por defecto
   public Array() {
      this.array = new int[0];
      this.sizeArray = 0;
      this.reader = new Scanner(System.in);
   }

   public int getSizeArrayFromUser() {
      System.out.print("Please enter the desired lenght of the array here: ");
      return reader.nextInt();
   }

   /*
    1 leer el tamano
    2 lo guardo ek tamano
    3 crear array
    4 rellenarlo
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


   /*
   1 inicializa string para pintar
   2 bucle para concatenar elementos del array en el string
   3 pintar string final
    */
   public void ArrayPrinter() {
      String arrayToString = "[";
      for (int i = 0; i < getSizeArray(); i++){
         arrayToString = arrayToString + " " + array[i];
      }
      arrayToString = arrayToString + "]";
      System.out.print("Your array is made of: " + arrayToString);
}





   public int getMaxNumber() {
      return 0;
   }

   public int getMinNumber() {
      return 0;
   }

   public int getOrderedIntergers() {
      return 0;
   }

   public int getPrimeIntergers() {
      return 0;
   }

   public int getIntergersRepetiedAndTimesOfRepetition() {
      return 0;
   }






   public int getSizeArray() {
      return sizeArray;
   }
   public void setSizeArray(int sizeArray) {
      this.sizeArray = sizeArray;
   }
   public int getArray() {
      return sizeArray;
   }
   public void setArray(int[]array) {
      this.array = array;
   }
}
/*
1 - Leer un array
   a / leer el tamaño del array
      1 buscar como leer del usuario.
      2 pedir/solicitar/pregutnar/que te pregunte por pantalla el numero y leerlo
      3 devolver lo que he leido
   b / completar el array del tamaño indicado
      1 necesito el tamaño. Se lo tengo que pasar por parametro
      2 asignar tamaño al array
      3 pedir al usuario que impute numeros HASTA QUE COMPLETE EL ARRAY
      4 guardar el array.
   c/ mostrar/pintarlo/... el array
   d/ obtener maximo
      1 ...
      2 ...
   e/ ....
   ____________________________________________
   1 - Leer un array
   a / leer el tamaño del array
      1 buscar como leer del usuario.
      2 pedir/solicitar/pregutnar/que te pregunte por pantalla el numero y leerlo
      3 devolver lo que he leido
   b / completar el array del tamaño indicado
      1 necesito el tamaño. Se lo tengo que pasar por parametro
      2 asignar tamaño al array
      3 pedir al usuario que impute numeros HASTA QUE COMPLETE EL ARRAY
      4 return/devolver.
   c/ set/get del atributo array
   d/ mostrar/pintarlo/... el array
   e/ ºobtener maximo
   f/ ordernar de menor a mayor



 */




