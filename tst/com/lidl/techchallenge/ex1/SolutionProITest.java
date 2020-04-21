package com.lidl.techchallenge.ex1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionProITest {
    public final static int N=3000;
    private static int[] arr;
    private static SolutionI.Res expectedRes;
    private static int pred;

    @BeforeAll
    static void setUp() {
        Statement ex1 = new Statement(N, false);
        arr=ex1.getArr();
        expectedRes = ex1.getRandomRes();
        pred = ex1.getSumFromRes(expectedRes);
    }

    private void findMultipleIndexesThatSum(SolutionProI solution) {
        List<SolutionI.Res> obtainedRes = solution.findMultipleIndexesThatSum(arr, pred);
        assertTrue(obtainedRes.contains(expectedRes));
    }

    @Test
    void sol3FindMultipleIndexesThatSum() {
        findMultipleIndexesThatSum(new Sol3());
    }
}