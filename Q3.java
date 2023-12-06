// package APCSUnit7;
import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        n1.add(2);
        n1.add(9);
        n1.add(7);
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        n2.add(9);
        n2.add(9);
        n2.add(7);
        ArrayList<Integer> n3 = add(n1, n2);
        System.out.println(n3);
    }

    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> x = new ArrayList<>();
        int overTen = 0;
        int i=a.size()-1;
        int u=b.size()-1;
        while(i>=0||u>=0) {
            int sum = 0;
            if(i>=0) {
                sum+=a.get(i);
            }
            if(u>=0) {
                sum+=b.get(u);
            }
            if(overTen > 0) {
                sum++;
                overTen = 0;
            }
            if(sum > 9) {
                overTen++;
                sum-=10;
            }
            x.add(0,sum);
            i--;
            u--;
        }
        if(overTen>0) {
            x.add(0,1);
        }
        return x;
    }
}
