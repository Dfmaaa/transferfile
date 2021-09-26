import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class SeeIfInternetUp {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("http://www.google.com");
            HttpURLConnection conec = (HttpURLConnection) url.openConnection();
             conec.connect();
             System.out.println("Internet is working!");
        }
        catch(MalformedURLException e){
         System.out.println("Internet is not working.");
        }
        catch(IOException e){
            System.out.println("Internet is not working.");
        }
    }
}