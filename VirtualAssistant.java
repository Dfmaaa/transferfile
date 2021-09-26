import java.util.Scanner;
public class VirtualAssistant {
    public static void main(String[] args) {
        String response,response2;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("response:");
            response = input.nextLine();
            response2=response.toLowerCase();
            switch (response2) {
                case "hello":
                    System.out.println("Hello!");
                    break;
                case "how are you":
                    System.out.println("Great!");
                    break;
                case "no":
                    System.out.println("That's not what ur mom said to me last night hehe");
                    break;
                case "what is the weather like today?":
                    System.out.println("Why r u asking a bot abt the weather lol go outside and touch some grass");
                    break;
                case "can we be friends?":
                    System.out.println("Sure we can!");
                    break;

                case "exit":
                    System.out.println("Fine!");
                    System.exit(0);
                case "close":
                    System.out.println("I don't like you");
                    System.exit(0);
                case "show your code":
                    System.out.println("No.");
                    break;
                case "what":
                    System.out.println("what?");
                    break;
                case "what?":
                    System.out.println("What?");
                default:
                    System.out.println("indeed");
            }
        }
    }
}