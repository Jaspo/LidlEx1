package com.lidl.techchallenge.ex1;



public class Main {

    public static SolutionI[] solutions = {
            new Sol1(),
            new Sol2()
    };

    public static void main(String[] args) {
        Statement ex1 = new Statement();
        SolutionI.Res expectedRes,obtainedRes;

        expectedRes=ex1.getRandomRes();
        int pred=ex1.getSumFromRes(expectedRes);

        for(int i=0; i<solutions.length;i++) {
            obtainedRes = solutions[i].findIndexesThatSum(ex1.getArr(), pred);
            boolean matches=(expectedRes.equals(obtainedRes));
            System.out.println("Solution "+i+" matches: "+matches);
        }


    }

}


