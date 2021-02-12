package com.sorokinartem.optionaltask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
/*    Задание. Ввести n чисел с консоли.
    2.     Вывести числа в порядке возрастания значений их длины.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String [] numbers = new String[n];
        for (int i = 0; i<numbers.length; i++){
            String line = reader.readLine();
            if(isNumber(line)){
                numbers[i] = line;
            } else {
                i--;    /*если строка не число, откручиваем счетчик назад, что бы не было пустой ячейки в массиве*/
            }
        }
        sort(numbers);

    }

    public static boolean isNumber (String line){         /*Метод проверяет что строка является числом*/
        try{
            Double.parseDouble(line);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    public static void sort (String [] arr){       /*сортируем массив по возрастанию пузырьком*/
        boolean isSorted = false;
        String buffer;
        while (!isSorted){
            isSorted = true;
            for (int i = 0;i<arr.length-1;i++){
                if (arr[i].length()>arr[i+1].length()){
                    isSorted = false;
                    buffer = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=buffer;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
