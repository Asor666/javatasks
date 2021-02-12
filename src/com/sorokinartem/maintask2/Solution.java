package com.sorokinartem.maintask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
//    Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        for(int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}
