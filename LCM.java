import java.util.Scanner;
public class LCM {
    static String doubleverify(double number) {
        if (number - (int) number == 0.0) {
            return "int";
        } else {
            return "double";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like the LCM of:");
        int length = input.nextInt();
        int[] a = new int[length];
        int start = 0;
        int lol=0;
        int counter = 0;
        String[] b = new String[length];
        for (int n = 0; n <= length - 1; n++) {
            System.out.print("Enter number " + (n + 1) + ':');
            a[n] = input.nextInt();
        }
        for (int x = 0; x <= length - 1; x++) {
            if (a[x] > a[0]) {
                a[0] = a[x];
            }
        }
        int maximum = a[0];
        int[] c = new int[maximum];
        for (int ff = 0; ff <= maximum; ff++) {
            for (int s = 0; s <= length - 1; s++) {
                double result = a[s] % ff;
                for (int rf = 0; rf <= length - 1; rf++) {
                    b[rf] = doubleverify(result);
                }

            }
            for (int gf = 0; gf <= length - 1; gf++) {
                if (b[gf].equals("int")) {
                    counter++;
                }
            }
            for (int nn = 0; nn <= maximum - 1; nn++) {
                if (counter == length - 1) {
                    lol=lol+1;
                    c[lol] = ff;
                }
            }

            for (int fn = 0; fn <= length - 1; fn++) {
                if (c[fn] < c[0]) {
                    c[0] = c[fn];
                }
            }
        }
        System.out.println(c[0] + " is the LCM.");
    }
}