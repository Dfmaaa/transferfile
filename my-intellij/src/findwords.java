import java.util.Scanner;
public class findwords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the sentence:");
            String sentence = input.nextLine();
            System.out.print("The word you are looking for:");
            String word = input.nextLine();
            String[] wordcheck = word.split(" ");
                int counter = 0;
                String[] a = sentence.split(" ");
                for (int xx = 0; xx <= a.length - 1; xx++) {
                    if (a[xx].equals(word)) {
                        counter++;
                    }
                }
                if (counter == 0) {
                    System.out.println('"' + word + '"' + " was not found in the sentence you entered.");
                }
                if (counter == 1) {
                    System.out.println('"' + word + '"' + " was found one time in the sentence you entered.");
                }
                if (counter > 1) {
                    System.out.println('"' + word + '"' + " was found " + counter + " times in the sentence you entered.");
                }
            }

                }
            }

