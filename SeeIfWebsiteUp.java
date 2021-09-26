import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
public class SeeIfWebsiteUp {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the URL:");
            String web = input.nextLine();
            URL url = new URL(web);
            HttpURLConnection conec = (HttpURLConnection) url.openConnection();
            int code = conec.getResponseCode();
            if (code >= 200 & code <= 299) {
                System.out.println("The website is up!");
            }
            if (code >= 400 & code <= 499) {
                System.out.println("There's some error on your side..");
            }
            if (code >= 500 & code <= 599) {
                System.out.println("There's some error on their side.");
            }
            if (code >= 300 & code <= 399) {
                System.out.println("The URL's redirecting");
            }
            if (code == 102) {
                System.out.println("They are processing the request.");
            }
            if (code == 204) {
                System.out.println("There is no response to send for the request you entered.");
            }
        }
        catch(Exception UnknownHostException){
            System.out.println("Please make sure that you are connected to the internet, if you are then Please make sure the URL is correct.");
        }
    }
}