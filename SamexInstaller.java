import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
public class SamexInstaller {
	public static void downloadFile(URL url, String fileName) throws Exception {
        try (InputStream in = url.openStream()) {
            Files.copy(in, Paths.get(fileName));
        }
    }
	static boolean allexist() {
		File s=new File("Samex.class");
		File s_r=new File("SamexRun.class");
		File uns=new File("Uninstall.class");
		File word=new File("words.txt");
		int counter=0;
		if(word.exists()==true){
			counter++;
		}
		if(s.exists()==true) {
			counter++;
		}
		if(s_r.exists()==true) {
			counter++;
		}
		if(uns.exists()==true) {
			counter++;
		}
		if(counter>0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
        try{
		if(allexist()==true) {
			System.out.println("It looks like you've already installed Samex.");
		}
		else {
			URL update_1=new URL("https://samexofficial.github.io/Samex.class");
                URL update_2=new URL("https://samexofficial.github.io/SamexRun.class");
                URL update_3=new URL("https://samexofficial.github.io/Uninstall.class");
                URL update_4=new URL("https://samexofficial.github.io/Samex_help_page.html");
                URL update_5=new URL("https://samexofficial.github.io/Samex_Interactive_Help.py");
                URL update_6=new URL("https://samexofficial.github.io/Updates.class");
				URL update_7=new URL("https://samexofficial.github.io/words.txt");
				URL update_8=new URL("https://samexofficial.github.io/error.wav");
				URL update_9=new URL("https://samexofficial.github.io/success.wav");
				URL update_10=new URL("https://samexofficial.github.io/shutdown.wav");
                System.out.println("Installing Samex.class...");
                downloadFile(update_1,"Samex.class");
                System.out.println("Installing SamexRun.class...");
                downloadFile(update_2,"SamexRun.class");
                System.out.println("Installing Samex help page.html...");
                downloadFile(update_4,"Samex help page.html");
                System.out.println("Installing Samex Interactive Help.py...");
                downloadFile(update_5,"Samex Interactive Help.py");
                System.out.println("Installing Updates.class...");
                downloadFile(update_6,"Updates.class");
                System.out.println("Installing Uninstall.class...");
                downloadFile(update_3,"Uninstall.class");
				System.out.println("Downloading words.txt(for soundex feature)");
				downloadFile(update_7,"words.txt");
				System.out.println("Downloading error.wav(for error sound)");
				downloadFile(update_8,"error.wav");
				System.out.println("Downloading success.wav(for success sound)");
				downloadFile(update_9,"success.wav");
				System.out.println("Downloading shutdown.wav(for shutdown sound)");
				downloadFile(update_10,"shutdown.wav");
                System.out.println("Installation complete! You can delete this installer if you want.");
		}
	}
    catch(Exception e){
        System.out.println("Something went wrong. Please try again. If you keep seeing this message, contact sameerkw23@gmail.com");
    }
}

}
