import java.util.Scanner;
public class Wordsort {
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the word:");
            String word = input.nextLine().toLowerCase();
            String result;
            int length = word.length();
            char[] a = word.toCharArray();
            int index = word.indexOf(' ');
            if (index == -1) {
                for (int y = 0; y <= length; y++) {
                    for (int x = 0; x <= length - 2; x++) {
                        result = pass(a[x], a[x + 1]);
                        if (result.equals("a1 is bigger")) {
                            char temp = a[x];
                            char temp2 = a[x + 1];
                            a[x] = temp2;
                            a[x + 1] = temp;
                        }
                    }
                }
                String end = String.valueOf(a);
                System.out.println(end);
            } else {
                while (index != -1) {
                    System.out.println("Please enter a word, not a sentence, no spaces!");
                    System.out.print("Enter the word:");
                    word=input.nextLine().toLowerCase();
                    index=word.indexOf(' ');
                    if (index == -1) {
                        for (int y = 0; y <= length; y++) {
                            for (int x = 0; x <= length - 2; x++) {
                                result = pass(a[x], a[x + 1]);
                                if (result.equals("a1 is bigger")) {
                                    char temp = a[x];
                                    char temp2 = a[x + 1];
                                    a[x] = temp2;
                                    a[x + 1] = temp;
                                }
                            }
                        }
                        String end = String.valueOf(a);
                        System.out.println(end);
                    }
                }
            }
        }
    }
}