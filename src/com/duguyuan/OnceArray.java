package com.duguyuan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OnceArray {

    public static void main(String[] args) {
        int[] arr = {2, 8, 6, 2, 7, 3, 9, 2, 8, 6, 7, 9, 1};
        ArrayList<Integer> onceNumber = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                onceNumber.add(entry.getKey());
            }
        }
        System.out.println("只出现一次的数字是：" + onceNumber.toString());
    }

}
