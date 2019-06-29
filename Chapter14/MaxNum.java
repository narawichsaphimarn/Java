package Chapter14;

import java.io.*;
import java.util.Scanner;

public class MaxNum implements MyNumber {

    public static void main(String[] args) {
        MaxNum mn = new MaxNum();
        //InputStreamReader ir = new InputStreamReader(System.in);
        //BufferedReader in = new BufferedReader(ir);
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        int i = 0;

        System.out.print("Set of number is ");
        for (i = 0; i < 5; i++) {
            num[i] = in.nextInt();
        }
        int max = mn.findNumber(num);
        System.out.println("Maximum number is " + max);
    }
    public int findNumber(int[] num) {
        int max = 0, j = 0;
        while (j != 5) {
            if (max <= num[j]) {
                max = num[j];
            }
            j++;
        }
        return max;
    }
}
