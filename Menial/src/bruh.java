import java.util.Scanner;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
public class bruh {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter DA TEXT:");//taking the text as input
        String text=input.nextLine();
        System.out.println("");
        System.out.print("HOW MANY TIMES:");//taking the end of the loo[ as input
        long times= input.nextLong();
        int start=1;
        String text1;
        text1=text;
      /*the brain of the program--> */  for(start=1;start<times;start++){
             text= text + " " +  text1;
        }
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("Copied successfully!");
     }
}

