import java.io.*;
import java.util.Scanner;
public class Filesee {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to do? Enter /help for commands.");
            String command = input.nextLine();
            if (command.equals("write")) {
                System.out.print("Enter File location:");
                try {
                    String name = input.nextLine();
                    File file = new File(name);
                    FileWriter write = new FileWriter(file);
                    System.out.print("Enter the text you would like to write into " + file + ':');
                    write.write(input.nextLine());
                    write.close();
                }
                catch(FileNotFoundException exp){
                    System.out.println("File not found.");
                }
            }
            if (command.equals("remove")) {
                System.out.print("Enter file location:");
                String loc = input.nextLine();
                File d = new File(loc);
                if (d.delete() == true) {
                    System.out.println("File has been deleted successfully.");
                } else {
                    System.out.println("Failed to delete the file.");
                }
            }
            if (command.equals("getcontents")) {
                System.out.print("Enter file location:");
                String locat = input.nextLine();
                File fileToRead = new File(locat);
                try (FileReader fileStream = new FileReader(fileToRead);
                     BufferedReader bufferedReader = new BufferedReader(fileStream)) {
                    String line = null;
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }

                }
                catch (FileNotFoundException ex) {
                    System.out.println("File not found.");
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (command.equals("create")) {
                System.out.println("What should be the location of the file:");
                String location = input.nextLine();
                try {
                    File fg = new File(location);
                    fg.createNewFile();
                    System.out.println(fg.getName() + " has been created!");
                } catch (Exception e) {
                    System.out.println("Some error has occurred.");
                }
            }
            if (command.equals("exit")) {
                System.exit(0);
            }
            if(command.equals("/help")){
                System.out.println("Type \"create\" to create new files.");
                System.out.println("Type \"exit\" to exit.");
                System.out.println("Type \"remove\" to delete files.");
                System.out.println("Type \"getcontents\" to get the contents of a file.");
                System.out.println("Type \"write\" to write into files.");
            }
            else if(!(command.equals("/help")||command.equals("create")||command.equals("getcontents")||command.equals("remove")||command.equals("write")||command.equals("exit"))){
                System.out.println("Invalid command. Please try again.");
            }
        }
    }
}