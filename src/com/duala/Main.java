package com.duala;

public class Main {
    static int[][] array ;
    static int[][] newArray ;
    static int[] oneDarray;

    public static void main(String[] args) {
	// write your code here
//        System.out.println(linearIndx(5,2));

        genArray(128);
        gen1dArray(128);
        make2d(128);
//        display1dArray(8);
        displayArray(128);
    }




    //returns the maximum linear index for the given 2d row index
    public static int maxIndx(int num){
        int sum = 2*num;
        for (int i = 1; i <num; i++)
            sum +=i;
        return sum;
    }

    public static int linearIndx(int i, int j){
        return maxIndx(i) - (i-j);
    }

    //Function that takes the row and column index from the 2dimensional array to return the corresponding 1d index
    public static int[] inverseIndx(int I){
        int row = 0;
        int column = I;
        while (row <=column){
            column -= row;
            row++;
        }
        row--;
        return new int[]{row, column};

    }


    public static void genArray(int n) {
        array = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int column = 0; column <= row; column++) {
                array[row][column] = 1;//random number
            }
        }
    }

    public static void gen1dArray(int size){
        int numElements = ((1+size)*size)/2;

        oneDarray = new int[numElements];

        for (int index = 0; index < numElements; index++) {
            int[] val = inverseIndx(index);
            oneDarray[index] = array[val[0]][val[1]];
        }

    }


    static void make2d(int size){
        newArray = new int[size][size];
        for (int i = 0; i < oneDarray.length; i ++){
            int[] vals = inverseIndx(i);
            newArray[vals[0]][vals[1]] = oneDarray[i];
        }
    }


    static void displayArray(int n){

        for (int row = 0; row < n; row++) {
            System.out.print("\nrow"+ row+ " ");
            for (int column = 0; column < n; column++) {
                System.out.print(newArray[row][column]);
            }
        }
    }


    static void display1dArray(int size){
        int numElements = ((1+size)*size)/2;
        for (int i = 0; i <numElements; i++)
            System.out.print(oneDarray[i]);
    }




}


