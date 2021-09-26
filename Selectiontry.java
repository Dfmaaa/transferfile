import java.util.Scanner;
public class Selectiontry {
    static int returnmin(int[] array,int start) {
        int length=array.length;
        for(int i=start;i<=length-1;i++) {
            if(array[0]<array[i]) {
                array[0]=array[i];
            }
        }
        return array[0];
    }
    static int returnpos(int[] a,int value) {
        int count=0;
        int position=00;
        for(int l=0;l<=a.length-1;l++) {
            if(a[l]==value) {
                ;
                position=l;
            }
        }
        return position;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many numbers would you like to sort:");
        int length=input.nextInt();
        int[] a=new int[length];
        int n=0;
        int ng=0;
        for(int xx=0;xx<=length-1;xx++) {
            System.out.print("Enter number " + (xx+1) + ':');
            a[xx]=input.nextInt();
        }
        for(int f=n;f<=length-1;f++) {
            int l=returnmin(a,ng);
            if(a[f]>l) {
                int poss=returnpos(a,l);
                int temp=a[f];
                int temp2=a[poss];
                a[f]=temp2;
                a[poss]=temp;
                n++;
                ng++;
            }
        }
        for(int nn=0;n<=length-1;nn++) {
            System.out.print(a[nn] + ' ');
        }
        System.out.println(" ");
        System.out.println("Finished.");


    }
}
/*
ALGORITHMS USED IN THE CLASS:-
1) an algorithm that the smallest number in an array.
2)an algorithm that find the position of a value in a given array.
3)Selection sort

THE ALGORITHM OF THE WHOLE CLASS:-
Receive the length of the array of the unsorted digits as the input.
Take values of array as input.
make a variable n with the value 0, make a variable ng with value 0.
start a for loop in which f=n and f will be incremented till it reaches length of array-1.
use the minimum algorithm to find the smallest number in the array and starting point as ng.
result of using the minimum algorithm will be l.
use the position algorithm, enter the array and add l as the value parameter.
result will be poss.
if a[f] is bigger than a[l] swap them by making temporary variables to swap them like int temp=a[f] and int temp2=a[poss] a[poss]=temp and a[f]=temp2.
increment n and ng if above statement is true.
print all the values of a.
THE END.

EXCEPTIONS:
3566775963566276Exception
java.lang.ArrayIndexOutOfBoundsException in line 42 in the main method.
*/
