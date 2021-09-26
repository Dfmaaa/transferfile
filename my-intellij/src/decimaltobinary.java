import java.util.Scanner;
public class decimaltobinary {
    static void asciitobinary(int n) {
        int[] binaryNum = new int[32];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    static int binarytoascii(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice.Type Y to use sentence to binary and type F to use binary to sentence.");
            String choice = input.nextLine();
            if (choice.equals("Y")) {
                System.out.println("Enter the sentence.");
                String sentence = input.nextLine();
                int length = sentence.length();
                char[] a = sentence.toCharArray();
                int[] b = new int[length];
                for (int x = 0; x <= length - 1; x++) {
                    int ascii = (int) sentence.charAt(x);
                    b[x] = ascii;
                }
                int result = 0;
                for (int temp = 0; temp < b.length; temp++) {
                    result *= 10;
                    result += b[temp];

                }
                asciitobinary(result);
            }
            if (choice.equals("F")) {
                System.out.println("Enter binary");
                try {
                    int binary = input.nextInt();
                    String binary2 = Integer.toString(binary);
                    int length = binary2.length();
                    int part2 = binarytoascii(binary);
                    char converted = (char) part2;
                    System.out.println(converted);
                } catch (Exception e) {
                    System.out.println("Enter binary. not characters or strings.");
                }
            } else {
                System.out.println("Wrong command.");
            }
        }
    }
}