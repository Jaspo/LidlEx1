package com.lidl.techchallenge.ex1;

import java.util.Arrays;

public class Sol2 implements SolutionI {
    @Override
    public Res findIndexesThatSum(int[] arrOrig, int sum){
        int[] arr=arrOrig.clone();
        Arrays.sort(arr);
        int i,j; i=j=0;
        boolean done=false;
        int lastIndex=arr.length-1;

        while(!done){
            j=Arrays.binarySearch(arr, i+1, lastIndex, sum-arr[i]);


            if (j>=0) done=true;
            else i++;
        }
        return new Res(Util.indexOf(arrOrig, arr[i]),Util.indexOf(arrOrig,arr[j]));
    }

}

