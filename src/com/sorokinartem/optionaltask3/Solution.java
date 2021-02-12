package com.sorokinartem.optionaltask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
//    Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
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
        printNumberWithDiffDigits(numbers);
    }
    public static boolean isNumber (String line){         /*Метод проверяет что строка является числом*/
        try{
            Double.parseDouble(line);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    public static boolean isDigitsDifferent(String number) {     /*Метод проверяет состоит ли число из разных чисел*/
        if (number.length() < 2) {
            return false;
        }
        for (int i = 0; i < number.length() - 1; i++) {
            for (int j = i+1; j < number.length(); j++) {
                if (number.charAt(i) == number.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printNumberWithDiffDigits(String[] array) {   /*Метод ищет в массиве первое число с разными числами*/
        for (int i = 0; i < array.length; i++) {
            if (isDigitsDifferent(array[i])) {
                System.out.println(array[i]);
                break;
            }
        }
    }
    }


