import java.util.Scanner;
public class test {
    static int wordidentify(String sentence, int lookfrom) {
        int temp = sentence.length();
        int result = sentence.indexOf(' ', lookfrom);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = input.nextLine();
        String f;
        int length = string.length();
        String[] a = new String[length];
        int start = 0;
        int start1;
        int nn=0;
        for (start = 0; start <= length - 1; start++) {
            int x = wordidentify(string, nn);
            nn=x+1;
            if (nn>0) {
                for (start1 = 0; start1 <= x; start1++) {
                    a[start1] = String.valueOf(string.charAt(start1) + string.charAt(start1 + 1));
                }
            }
        }
        int ff=0;
        for(ff=0;ff<=length-1;ff++){
            System.out.println(a[ff]);
        }
    }
}