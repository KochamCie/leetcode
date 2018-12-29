package com.hama.ext.sort;

public interface Sort {


    int[] sort(int[] arr);

    public static void display(int[] arr){
        for (int i : arr) {
            System.out.print(i);

        }
        System.out.println();
    }
}
