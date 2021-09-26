import java.util.*;
public class hashplay {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        CobraS lol=new CobraS();
        System.out.print("How many numbers would you like to sort:");
        int length= input.nextInt();
        System.out.print("Enter a for ascending, enter b for descending:");
        char choice=input.next().charAt(0);
        int[] a=new int[length];
        for(int x=0;x<=length-1;x++){
            System.out.print("Enter number " + (x+1) + ':');
            a[x]=input.nextInt();
        }
        a=lol.sortNumbers(a,choice);
        for(int x=0;x<=a.length-1;x++){
            System.out.print(a[x] + ' ');
        }
    }

}