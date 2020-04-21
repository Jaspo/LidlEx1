package com.lidl.techchallenge.ex1;

import java.util.*;

public class Util {
    public static Random rd =new Random();
    public static int[] initArray(int n, boolean singleSolution) {
        int[] arr = new int[n];
        Set<Integer> allSums= new HashSet<>();
        for (int i = 0; i < arr.length;) {
            int candidate=rd.nextInt()/2;
            int j=0;
            boolean alreadyThere=false;
            List<Integer> newSums= new ArrayList<>();
            while(singleSolution && j<i && !alreadyThere){
                int newSum=arr[j]+candidate;

                if (allSums.contains(newSum)) alreadyThere=true;
                else {
                    newSums.add(newSum);
                    j++;
                }

            }
            if (!singleSolution || !alreadyThere) {
                arr[i] = candidate;
                allSums.addAll(newSums);
                i++;
            }
        }
        return arr;
    }


    public static int getRandomIndex(int[] arr){
        return rd.nextInt(arr.length);

    }
    public static int indexOf(int[] arr,int search) {
        return indexOf(arr, 0, arr.length,search);
    }
    public static int indexOf(int[] arr, int fromIndex, int toIndex,int search) {
        if (fromIndex<0) fromIndex=0;
        if (toIndex> arr.length) toIndex=arr.length;
        for(int i = fromIndex; i < toIndex; i++) {
            if(arr[i] == search) {
                return i;
            }
        }
        return -1;
    }
}
