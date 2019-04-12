package Test;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println("Welcom to Tic Tac Toe");
        System.out.println("The first player is X");
        int step = 0, count = 0;
        boolean n = true;
        while (n) {
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(num[i] + "       ");
                    i++;
                }
                System.out.println();
                i--;
            }
            System.out.println();
            if ((num[0] == 'X' && num[1] == 'X' && num[2] == 'X') || (num[3] == 'X' && num[4] == 'X' && num[5] == 'X')
                    || (num[6] == 'X' && num[7] == 'X' && num[8] == 'X') || (num[0] == 'X' && num[3] == 'X' && num[6] == 'X')
                    || (num[1] == 'X' && num[4] == 'X' && num[7] == 'X') || (num[2] == 'X' && num[5] == 'X' && num[8] == 'X')
                    || (num[0] == 'X' && num[4] == 'X' && num[8] == 'X') || (num[2] == 'X' && num[4] == 'X' && num[6] == 'X')) {
                System.out.println("Player X win");
                n = false;
            } else if ((num[0] == '0' && num[1] == '0' && num[2] == '0') || (num[3] == '0' && num[4] == '0' && num[5] == '0')
                    || (num[6] == '0' && num[7] == '0' && num[8] == '0') || (num[0] == '0' && num[3] == '0' && num[6] == '0')
                    || (num[1] == '0' && num[4] == '0' && num[7] == '0') || (num[2] == '0' && num[5] == '0' && num[8] == '0')
                    || (num[0] == '0' && num[4] == '0' && num[8] == '0') || (num[2] == '0' && num[4] == '0' && num[6] == '0')) {
                System.out.println("Player 0 win");
                n = false;
            } else if (count == 9) {
                System.out.println("No winner");
                n = false;
            } else {
                int pos;
                do {
                    String look = (step == 0) ? "for X" : "for 0";
                    System.out.print("Plase select position 1-9 " + look + " : ");
                    pos = in.nextInt();
                } while (pos <= 0 || pos >= 10);
                if (num[pos - 1] == 'X' || num[pos - 1] == '0') {
                    System.out.println("- Plase choose new line -");
                } else if (step == 0) {
                    num[pos - 1] = 'X';
                    step++;
                    count++;
                } else {
                    num[pos - 1] = '0';
                    step--;
                    count++;
                }
            }
        }
    }
}
