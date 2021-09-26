import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
public class DestroyInternet {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        System.out.print("Would you like to destroy the home network? Enter Y to destroy, enter N to not destroy:");
        char Choice = input.next().charAt(0);
        if (Choice == 'Y'){
            String websi = "www.chess.com";
            String website = "https://" + websi;
            URL url = new URL(website);
         while (true) {
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            counter++;
            System.out.println(counter + " requests :).");
        }
    }
        if(Choice=='N'){
            System.out.println("Then why did you run it?");
            System.exit(0);
        }
        else{
            System.out.println("Invalid choice.");
        }
    }
}