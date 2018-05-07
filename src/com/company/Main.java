package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    static int[] arr = new int[] {1,2,3,2,3,3};


    public static void main(String[] args) {
	// write your code here

        for(int number : arr) {
            if (map.get(number) == null)
                map.put(number, true);
            else
                map.remove(number);

        }


        System.out.println("The odd occurred integers are:  "+map.keySet());

    }
}
