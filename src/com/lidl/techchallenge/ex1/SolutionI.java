package com.lidl.techchallenge.ex1;

import java.util.Objects;

public interface SolutionI {
    Res findIndexesThatSum(int[] arr, int sum);

    class Res{
        public int i, j;
        public Res(int i, int j){
            this.i=i;
            this.j=j;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null)
                return false;
            if (getClass() != o.getClass())
                return false;
            Res res = (Res) o;
            return (i==res.i
                    && j== res.j) || (i==res.j
                    && j== res.i);
        }
        @Override
        public int hashCode() {
            return Objects.hash(i,j);
        }

        @Override
        public String toString()
        {
            return "i: " +i + " -- j: "+ j;
        }
    }
}
