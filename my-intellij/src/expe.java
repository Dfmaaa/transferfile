import java.util.Scanner;
public class expe {


    static int comp(String first, String second) {
        first=first.trim();
        second=second.trim();
        int length1 = first.length();
        int length2 = second.length();
        int till = Math.min(length1, length2);
        // loop below
        for (int i = 0; i <till; i++) {
           // int count = 0;
            int firstcheck = (int) first.charAt(i);
            int secondcheck = (int) second.charAt(i);

            // if (first.charAt(i) != second.charAt(i)) {                return firstcheck - secondcheck; }


            if (firstcheck != secondcheck) return (firstcheck - secondcheck);

        }


        if (length1 != length2) {
            if (length1 < length2) return 1;
            if (length1 > length2) return -1;
        }
        else {
            return 0;
        }
        return 999;
    }


    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      System.out.println("Enter string 1");
      String first=input.nextLine();
      System.out.println("Enter string 2");
      String second=input.nextLine();

        System.out.println("Comparing " +first + " and " + second
                + " : " + comp(first, second));

     // int result=equals(first,second);fa

      /* if(result==-1){
          System.out.println("Not equal");
      }
      else{
          System.out.println("Equal");
      }
*/


    }
}
