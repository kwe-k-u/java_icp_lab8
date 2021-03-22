package com.duala;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(linearIndx(5,2));

        genArray(32);
//        inverseIndx(17);
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
        while (row <column){
            column -= row;
            row++;
        }
        row--;
        System.out.println(row + ","+ column);
        return new int[]{row, column};

    }


    public static void genArray(int n){
        int[][] array = new int[n][n];

        for (int row = 0; row < n; row++){
            for (int column = 0; column <= row; column++){
                array[row][column] = 1;
            }
        }

        System.out.println("array");
        for (int row = 0; row < n; row++) {
            System.out.print("\nrow"+ row+ " ");
            for (int column = 0; column < n; column++) {
                System.out.print(array[row][column]);
            }
        }
    }




}


