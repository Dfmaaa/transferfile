import java.util.Scanner;

public class methodSentence {
    static int letter(char letter) {
        if (letter == 'a') {
            return 26;
        }
        if (letter == 'b') {
            return 25;
        }
        if (letter == 'c') {
            return 24;
        }
        if (letter == 'd') {
            return 23;
        }
        if (letter == 'e') {
            return 22;
        }
        if (letter == 'f') {
            return 21;
        }
        if (letter == 'g') {
            return 20;
        }
        if (letter == 'h') {
            return 19;
        }
        if (letter == 'i') {
            return 18;
        }
        if (letter == 'j') {
            return 17;
        }
        if (letter == 'k') {
            return 16;
        }
        if (letter == 'l') {
            return 15;
        }
        if (letter == 'm') {
            return 14;
        }
        if (letter == 'n') {
            return 13;
        }
        if (letter == 'o') {
            return 12;
        }
        if (letter == 'p') {
            return 11;
        }
        if (letter == 'q') {
            return 10;
        }
        if (letter == 'r') {
            return 9;
        }
        if (letter == 's') {
            return 8;
        }
        if (letter == 't') {
            return 7;
        }
        if (letter == 'u') {
            return 6;
        }
        if (letter == 'v') {
            return 5;
        }
        if (letter == 'w') {
            return 4;
        }
        if (letter == 'x') {
            return 3;
        }
        if (letter == 'y') {
            return 2;
        }
        if (letter == 'z') {
            return 1;
        } else {
            return 0;
        }
    }

    static String pass(char a1, char a2) {
        if (letter(a1) > letter(a2)) {
            return "a1 is bigger";
        }
        if (letter(a2) > letter(a1)) {
            return "a2 is bigger";
        } else {
            return "equal";
        }
    }

    static String returnSentence(String sentence) {
        String[] a = sentence.split(" ");
        String ab=a.toString();
        int length = ab.length();
        String[] b = new String[length];
        int start = 0, start2 = 0;
        int l = length - 1;
        char f, f1, n, n1;
        int un = 0;
        for (start = 0; start <= length - 1; start++) {
            b[start] = a[start].toLowerCase();
        }

        /*algo starts here*/
        for (int ff = 0; ff <= length - 1; ff++) {

            for (start2 = 0; start2 <= length - 2; start2 = start2 + 1) {
                n = b[start2].charAt(0);
                n1 = b[start2 + 1].charAt(0);
                String result = pass(n, n1);
                if (result.equals("a1 is bigger")) {
                    String temp = b[start2];
                    String temp2 = b[start2 + 1];
                    b[start2] = temp2;
                    b[start2 + 1] = temp;
                }
                if (result.equals("equal")) {
                    un = un + 1;
                    f = b[start2].charAt(un);
                    f1 = b[start2 + 1].charAt(un);
                    String result1 = pass(f, f1);
                    if (result1.equals("a1 is bigger")) {
                        String temp3 = b[start2];
                        String temp4 = b[start2 + 1];
                        b[start2] = temp4;
                        b[start2 + 1] = temp3;
                    }
                }
            }
        }
        String result = b.toString();
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the sentence");
            String sentence = input.nextLine();
            String result = returnSentence(sentence);
            System.out.println(result);
        }
    }
}