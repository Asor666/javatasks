package com.sorokinartem.maintask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
//    Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int product = 1;
        while (true){
            int num;
            try {
                num = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                break;
            }
            sum+=num;
            product*=num;
        }
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Произведение чисел: " + product);
    }
}
