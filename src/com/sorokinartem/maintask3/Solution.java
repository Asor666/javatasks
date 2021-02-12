package com.sorokinartem.maintask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
//    Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(reader.readLine());
        int nums[] = new int[amount];

        for (int i = 0;i<nums.length;i++){
            nums[i] = (int) (Math.random()*100);
            System.out.println(nums[i]);
        }
        for (int number:nums){
            System.out.print(number + " ");
        }
    }
}
