package Chapter11;

import java.util.Scanner;
import java.util.ArrayList;

public class MySentence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>(6);
        str.add("Long live the king");
        str.add("living room");
        str.add("Grape");
        str.add("This is a cat");
        str.add("Not at all");
        str.add("I will see you around");
        System.out.print("Enter you want to string : ");
        String name = in.nextLine();
        for (int k = 0; k < name.length(); k++) {
            String index;
            int step = 1;
            for (int i = 0; i < str.size(); i++) {
                index = str.get(i);
                for (int j = 0; j < index.length(); j++) {
                    if ((name.charAt(k) == index.charAt(j)) && step == 1) {
                        System.out.print(index.charAt(j) + "");
                        step = 0;
                    }
                }
            }
        }
    }
}
