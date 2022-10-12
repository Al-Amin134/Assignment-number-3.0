/**
 * Question Number 7.7
 */

import java.util.Random;
import java.util.Scanner;

public class PermutationGeneratorChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int t;
        t=in.nextInt();
        int a[] = new int[100];
        n = in.nextInt();
        while(t>0) {
            Random rand = new Random();


            for (int i = 0; i < n; i++) {
                a[i] = rand.nextInt(10);
                System.out.print(" " + a[i]);


            }
            System.out.println();
            t=t-1;
        }
    }
}


