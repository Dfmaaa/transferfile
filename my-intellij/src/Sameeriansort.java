import java.util.Scanner;//importing the Scanner class.

public class Sameeriansort {
    // method that returns the smallest value in an array.
    static int returnMin(int[] a){
        for(int x=0;x<=a.length-1;x++){
            if(a[0]>a[x]){
                a[0]=a[x];//assigning the smaller element's value to the first element.
            }
        }
        return a[0];//returns the first element
    }
    //method that returns the largest value in an array.
    static int returnMax(int[] a){
        for(int x=0;x<=a.length-1;x++){
            if(a[0]<a[x]){
                a[0]=a[x];//assigning the larger element's value to the first element.
            }
        }
        return a[0];//returns the first element in the array.
    }
    // method that returns the position of a value in a given array.
    static int returnPosition(int[] a, int value){
        int position=0;//initializing the variable "position".
        for(int x=0;x<=a.length-1;x++){
            if(a[x]==value){
                position=x;//assigning the value(if the values match) that will be incremented as the loop continues.
            }
        }
        return position;//returns the variable "position".
    }
    //main method
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);//making an object of the Scanner class.
        // getting length of the arrays as input.
        System.out.print("How many numbers would you like to sort:");//asking how many numbers the person wants to sort.
        int length=input.nextInt();//getting length of all arrays as input.
        int min;//initializing the variable that will be used later.
        int[] a=new int[length];//original array that will receive input.
        int[] b=new int[length];//duplicate array.
        int[] c=new int[length];//final array.
        //assigning values to the array.
        for(int x=0;x<=length-1;x++){
            System.out.print("Enter number " + (x+1) + ':');//displaying what number to enter.
            a[x]=input.nextInt();//getting values of array as input.
            b[x]=a[x];//adding input to another array. Can be made better, but just to be sure, using another duplicate array.
        }
        //algorithm
        int max=returnMax(b)+1;//getting the largest value in the array and then adding one to it.
        for(int ff=0;ff<=length-1;ff++){
           min=returnMin(b);//getting the smallest value in the array.
           int pos=returnPosition(b,min);//getting the position of the smallest value in the array.
           c[ff]=a[pos];//adding the smallest value to the final array.
           b[pos]=max;//making the minimum value maximum+1
        }
        //loop to display the integers in the array
        for(int nf=0;nf<=length-1;nf++){
            System.out.println(c[nf]);
        }
    }
}
// The algorithm is:
//make a variable "n" that is the maximum value in the array+1.
//find the minimum value in the array.
//add it to the final array.
//assign the value of the n to the minimum value's element.
//continue till the length-1.