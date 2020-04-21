package com.lidl.techchallenge.ex1;


import java.util.concurrent.TimeUnit;

public class PerformanceTest {

    public static SolutionI[] solutions = {
            new Sol1(),
            new Sol2(),
            new Sol3()
    };

    public static void main(String[] args) {
        int N=2000;
        Statement ex1 = new Statement(N,true);
        SolutionI.Res expectedRes,obtainedRes;

        expectedRes=ex1.getRandomRes();
        int pred=ex1.getSumFromRes(expectedRes);

        for (SolutionI solution : solutions) {
            long startTime = System.nanoTime();
            solution.findIndexesThatSum(ex1.getArr(), pred);
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("--------------------------");
            System.out.println("Solution " + solution.getSolutionId());
            System.out.println("Execution time: " + (elapsedTime / 1000000.0));

        }


    }

}


