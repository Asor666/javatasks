package com.sorokinartem.optionaltask21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    /*Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
            1.     Упорядочить строки матрицы в порядке возрастания значений элементов k-го столбца.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(reader.readLine());   /*размер матрицы*/
        int [][] matrix = new int[n][n];
        int k = 1;   /*номер столбца по которому будет происходить сортировка матрицы*/

        for (int i = 0; i<matrix.length;i++){       /*заполнение матрицы случайными числами от -100 до 100*/
            for (int j = 0;j<matrix[i].length;j++){
                matrix[i][j]= (int)(Math.random()*100) - (int)(Math.random()*100);
            }
        }
        print(matrix);

        Arrays.sort(matrix, (x, y) -> y[k]-x[k]);  //сортируем

        print(matrix);
    }
    public static void print(int[][]matrix){   /*вывод матрицы на консоль*/
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("----------------------");
    }

}
