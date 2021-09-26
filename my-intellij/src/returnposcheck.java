import java.util.Scanner;

public class returnposcheck {
    static int returnpos(int[] a, int value) {
        int count = 0;
        int position = 00;
        for (int l = 0; l <= a.length - 1; l++) {
            if (a[l] == value) {
                ;
                position = l;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("How many numbers would you like to add to the array?");
            int length = input.nextInt();
            int[] a = new int[length];
            for (int x = 0; x <= length - 1; x++) {
                System.out.print("Enter number " + (x + 1) + ':');
                a[x] = input.nextInt();
            }
            System.out.print("What number would you like the position of?");
            int value = input.nextInt();
            int result = returnpos(a, value);
            if (result == 0 & a[0] != value) {
                System.out.println("Value was not found in the array!");
            } else {
                System.out.println(result);
            }
        }
    }
}