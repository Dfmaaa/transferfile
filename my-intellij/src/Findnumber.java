import java.util.Scanner;
public class Findnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the sentence:");
            String sentence = input.nextLine();
            int length = sentence.length();
            int[] a = new int[length];
            int start = 0;
            char var;
            int var2;
            int counter = 0;
            for (start = 0; start <= length - 1; start++) {
                var = sentence.charAt(start);
                try {
                    var2 = Integer.parseInt(String.valueOf(var));
                    int varcheck = var2 - 1;
                    if (var2 - 1 == varcheck) {
                        counter=counter+1;
                        a[start] = var2;
                        System.out.println(a[start]);
                    }
                } catch (Exception e) {
                }
            }
        }
    }
}