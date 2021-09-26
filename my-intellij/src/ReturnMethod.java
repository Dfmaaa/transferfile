import java.util.Scanner;
public class ReturnMethod {
    static int returnWords(String sentence) {
        int length = sentence.length();
        int counter = 0;
        char[] a = sentence.toCharArray();
        for (int x = 1; x <= length - 2; x++) {
            if (a[x] == ' ' & a[x - 1] != ' ' & a[x+1]!=' ') {
                counter++;
            }
        }
        return counter + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the sentence:");
            String sent = input.nextLine();
            int result = returnWords(sent);
            System.out.println(result);
        }
    }
}