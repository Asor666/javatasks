package com.sorokinartem.optionaltask1;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    /*Задание. Ввести n чисел с консоли.
      1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.*/
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
        maxAndMinLength(numbers);

    }
    public static boolean isNumber (String line){         /*Метод проверяет что строка является числом*/
        try{
            Double.parseDouble(line);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    public static void maxAndMinLength(String[] arr){        /*Считаем символы в строках с числами*/
        String max = arr[0];
        String min = arr[0];
        for (String num: arr){
            if (num.length()>max.length()) {
                max = num;
            }
            if (num.length()<min.length()){
                min = num;
            }
        }
        System.out.println("Самое короткое число: " + min + ",  с колличеством символов - "+min.length());
        System.out.println("Самое длинное число: " + max + ",  с колличеством символов - "+max.length());
    }
}
