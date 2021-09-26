import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Filehandlelearn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the location of the file(Enter it like C:backslashbackslashlocation):");
        String location = input.nextLine();
        File file=new File(location);
        System.out.print("Enter the text you would like to write:");
        String text=input.nextLine();
        try {
            FileWriter writer = new FileWriter(location);
            writer.write(text);

        }
        catch(IOException exp1){
            System.out.println("An error occurred.");
            exp1.printStackTrace();
        }
        catch(Exception FileNotFoundException ){
            System.out.println("File not found.");
            while(file.exists()==false){
                System.out.print("Enter the location again:");
                location=input.nextLine();
                System.out.print("Enter the text:");
                text=input.nextLine();
            }
        }
     System.out.println("Successfully written to the file.");
    }
}