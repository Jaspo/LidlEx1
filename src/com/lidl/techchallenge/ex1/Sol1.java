package com.lidl.techchallenge.ex1;

public class Sol1 implements SolutionI {
    @Override
    public Res findIndexesThatSum(int[] arr, int sum){

        int i,j; i=j=0;
        boolean done=false;
        int lastIndex=arr.length-1;

        while(!done){
            j= Util.indexOf(arr, i+1, lastIndex, sum-arr[i]);
            if (j>=0) done=true;
            else i++;
        }
        return new Res(i, j);
    }

}
