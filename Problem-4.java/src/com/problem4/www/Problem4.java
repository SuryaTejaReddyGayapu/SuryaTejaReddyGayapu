package com.problem4.www;

import java.util.HashMap;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};

        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();

        // initialize keys 1 to 9
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        System.out.println(result);
    }
}
