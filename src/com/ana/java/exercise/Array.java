package com.ana.java.exercise;

import java.util.Scanner;

public class Array {
   private int[] array;
   private int sizeArray;

   // constructor por defecto
   public Array() {
      System.out.println("Te estoy llamando");
      this.array = new int[0];
      this.sizeArray = 0;
   }

   public int getSizeArrayFromUser() {
      System.out.print("Please the desired lenght of the array here:");
      Scanner reader = new Scanner(System.in);
      return reader.nextInt();
   }
   public int arrayMaker() {
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




