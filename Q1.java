// package APCSUnit7;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Eratosthenes(100);
    }

    public static void Eratosthenes(int input) {
        ArrayList<Integer> x = new ArrayList<>();
        int p=0;
        for(int i=2; i<=input; i++) {
            x.add(i);
        }
        for(int q=0; q<x.size(); q++) {
            p = x.get(q);
            for(int s=q+1; s<x.size(); s++) {
                if(x.get(s) % p == 0) {
                    x.remove(s);
                    s--;
                }
            }
        }
        System.out.println(x);
    }
}
