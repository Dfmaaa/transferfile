import java.util.Scanner;
import java.net.*;
public class IPfind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter website path:");
            String s = input.nextLine();
            try {
                InetAddress ip = InetAddress.getByName(new URL(s).getHost());
                System.out.println("Public IP Address of: " + ip);
            } catch (MalformedURLException | UnknownHostException e) {
                System.out.println("Invalid URL");
            }
        }
    }
}