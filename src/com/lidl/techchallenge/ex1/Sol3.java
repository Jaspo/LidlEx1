package com.lidl.techchallenge.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol3 implements SolutionI, SolutionProI {

    @Override
    public String getSolutionId() {
        return "Sol3";
    }

    @Override
    public Res findIndexesThatSum(int[] arrOrig, int sum){
        int[] arr=arrOrig.clone();
        Arrays.sort(arr);
        int i,j;
        i=0;
        j=arr.length-1;
        boolean done=false;

        while(!done){
            int tmpres=arr[i]+arr[j];
            if (tmpres<sum) i++;
            else if (tmpres>sum) j--;
            else done=true;
        }
        return new Res(Util.indexOf(arrOrig, arr[i]),Util.indexOf(arrOrig,arr[j]));
    }

    @Override
    public List<Res> findMultipleIndexesThatSum(int[] arrOrig, int sum) {
        int[] arr=arrOrig.clone();
        Arrays.sort(arr);
        int i,j;
        i=0;
        j=arr.length-1;
        boolean done=false;

        List<Res> reslist= new ArrayList<>();

        while(i<j){
            int tmpres=arr[i]+arr[j];
            if (tmpres<sum) i++;
            else if (tmpres>sum) j--;
            else {
                reslist.add(new Res(Util.indexOf(arrOrig, arr[i]),Util.indexOf(arrOrig,arr[j])));
                i++;j--;
            }
        }

        return reslist;
    }
}
