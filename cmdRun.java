import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class cmdRun {
    public static void printResults(Process process) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Command:");
            try {
                String command = input.nextLine();
                if (command.equals("exit")) {
                    System.exit(0);
                }
                Process TheCommand = Runtime.getRuntime().exec(command);
                printResults(TheCommand);
            } catch (Exception IOException) {
                System.out.println("The command you entered is not recognized as an internal or external command; operable program or batch file.");
            }
        }
    }
}