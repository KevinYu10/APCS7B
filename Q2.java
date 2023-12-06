// package APCSUnit7;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        PrimeSum(48);
    }

    public static void PrimeSum(int input) {
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
        if(input % 2 == 0) {
            for(int c=0; c<x.size(); c++) {
                for(int t=c; t<x.size(); t++) {
                    if(input - x.get(c) == x.get(t)) {
                        System.out.println(x.get(c) +"+"+x.get(t));
                        break;
                    }
                }
            }
        }
    }
}
