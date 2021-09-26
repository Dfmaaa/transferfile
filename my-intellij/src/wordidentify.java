import java.util.Scanner;
public class wordidentify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence.");//taking the sentence as input
        String sentence = input.nextLine();
        int length = sentence.length();//the length of the sentence
        char[] a = sentence.toCharArray();// a character array containing all the character
        int start = 0;//loop variable
        String[] b = new String[length];//making a string array with length as length of the sentence
        for (int x = 0; x <= length - 1; x++) {
            int index = sentence.indexOf(' ', start);//searching for ' ' in the sentence within the index
            if (index != -1) {
                start = index;//start will increase if index does
                for (int y = 0; y <= index - 1; y++) {
                    String word = String.valueOf(a[y] + a[y + 1]);//adding the characters
                    b[y] = word;//filling the array with the words
                }
            }
        }
        for (int ff=0; ff <= length - 1; ff++) {
            if (ff != length - 1) {
                System.out.print(b[ff] + ',');//displaying the words
            }
            if(ff==length-1){
                System.out.print(b[ff]);
            }
        }
    }
}