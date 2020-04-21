package com.lidl.techchallenge.ex1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionITest {
    public final static int N=3000;
    private static int[] arr;
    private static SolutionI.Res expectedRes;
    private static int pred;

    @BeforeAll
    static void setUp() {
        Statement ex1 = new Statement(N, true);
        arr=ex1.getArr();
        expectedRes = ex1.getRandomRes();
        pred = ex1.getSumFromRes(expectedRes);
    }

    private void findIndexesThatSum(SolutionI solution){
        SolutionI.Res obtainedRes = solution.findIndexesThatSum(arr, pred);
        assertEquals(expectedRes,obtainedRes);
    }

    @Test
    void sol1FindIndexesThatSum() {
        findIndexesThatSum(new Sol1());
    }
    @Test
    void sol2FindIndexesThatSum() {
        findIndexesThatSum(new Sol2());
    }
    @Test
    void sol3FindIndexesThatSum() {
        findIndexesThatSum(new Sol3());
    }
}


