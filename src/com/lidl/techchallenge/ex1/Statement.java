package com.lidl.techchallenge.ex1;


public class Statement {
    private int[] arr;

    public int[] getArr(){
        return arr;
    }
    public Statement(int N,boolean singleSolution) {
        arr = Util.initArray(N,singleSolution);
    }
    public SolutionI.Res getRandomRes(){
        return new SolutionI.Res(Util.getRandomIndex(arr),Util.getRandomIndex(arr));
    }
    public int getSumFromRes(SolutionI.Res res){
        return arr[res.i]+arr[res.j];
    }
    public void printArray(){
        for (int i=0;i<10;i++)System.out.println("arr["+i+"]="+arr[i]);

    }

}


