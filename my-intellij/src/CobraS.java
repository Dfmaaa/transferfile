import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class CobraS {
    static String showln(String text) {
        System.out.println(text);
        return (text);
    }

    static int stringtoint(String value) {
        int n = Integer.parseInt(value);
        return n;

    }

    static String show(String text1) {
        System.out.print(text1);
        return text1;
    }

    public void version() {
        showln("1.0");
    }

    public void author() {
        show("Sameer Achhab");
    }

    static double sqrt(int number) {
        double val = number ^ (1 / 2);
        return val;
    }

    static double cbrt(int num) {
        double val1 = num ^ (1 / 3);
        return val1;
    }

    static double log(int base, int number1) {
        double thevalue = Math.log(number1) / Math.log(base);
        return thevalue;
    }

    public void show(int variable) {
        System.out.print(variable);
    }

    public void showln(int var) {
        System.out.println(var);
    }

    public void show(double thevar) {
        System.out.print(thevar);
    }

    public void showln(double thevar1) {
        System.out.println(thevar1);
    }

    public void show(char v) {
        System.out.println(v);
    }

    public void showln(char v1) {
        System.out.println(v1);
    }

    static double mod(double divisor, double dividend) {
        double num1 = dividend / divisor;
        int num2 = (int) num1;
        double num3 = (num2 * divisor);
        double result = (dividend - num3);
        return result;
    }

    public void exit(int seconds) throws InterruptedException {
        int second = (seconds * 1000);
        Thread.sleep(second);
        System.exit(0);
    }

    public void sleep(int Seconds) throws InterruptedException {
        int sec = (Seconds * 1000);
        Thread.sleep(sec);
    }

    public void createCFrame(String name, boolean visible, int Height, int Width, boolean defaultIcon, String filename) {
        JFrame frame = new JFrame(name);
        if (defaultIcon == true) {
            frame.setIconImage(new ImageIcon("C:\\Users\\SAM\\Downloads\\cobralogo.jpg").getImage());
        }
        if (defaultIcon == false) {
            frame.setIconImage(new ImageIcon(filename).getImage());
        }
        frame.setSize(Width, Height);
        if (visible == true) {
            frame.setVisible(true);
        }
    }

    static double AreaTriangle(double height, double base) {
        double newbase = (base * (1 / 2));
        double result = height * newbase;
        return result;
    }

    static double AreaSquare(double side) {
        double result = (side * 4);
        return result;
    }

    static double AreaRectangle(double length, double breadth) {
        double result = (length * breadth);
        return result;
    }

    static String returnTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return (dtf.format(now));
    }

    public void showTime(String format) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    public void findletter(String target, char letter) {
        int x = target.indexOf(letter);
        if (x == -1) {
            System.out.println("'" + letter + "'" + " wasn't found in " + '"' + target + '"');
        } else {
            System.out.println(x);
        }
    }

    static String inttoString(int integer) {
        String result = Integer.toString(integer);
        return result;
    }

    public void checkstringint(String target) {
        int process = Integer.parseInt(target);
        if (process - process == 0) {
            System.out.println("Integer");
        } else {
            System.out.println("String");
        }
    }

    public void checkdoubleint(double target) {
        int target1 = (int) target;
        if (target - target1 == 0.0) {
            System.out.println("Integer");
        }
    }

    public void randomint(int min, int max) {
        Random r = new Random();
        int result = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(result);
    }

    static String shrek() {
        System.out.println("⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆\n" +
                "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿\n" +
                "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀\n" +
                "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉");
        return "completed";

    }

    public void showTableof(int number, int till, int from) {
        int x = from;
        for (x = from; x >= till; x++) {
            System.out.println(number + "x" + x + '=' + number * x);
        }
        System.out.println("Completed.");
    }

    static int returnRandomint(int min, int max) {
        Random r = new Random();
        int result = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return result;
    }

    static String returnstringifint(String target) {
        int process = Integer.parseInt(target);
        if (process - process == 0) {
            return "Integer";
        } else {
            return "String";
        }
    }

    static String returndoubleifint(double target) {
        int target1 = (int) target;
        if (target - target1 == 0.0) {
            return "Integer";
        } else {
            return "Double";
        }
    }

    static String returnifprime(int number) {
        int x = 1;
        int counter = 0;
        for (x = 1; x <= number; x++) {
            long f = number % x;
            if (f == 0) {
                counter = counter + 1;
            }
        }
        if (counter > 2) {
            return "Composite";
        } else {

            return "Prime";
        }
    }

    public void showifprime(int number) {
        int x = 1;
        int counter = 0;
        for (x = 1; x <= number; x++) {
            long f = number % x;
            if (f == 0) {
                counter = counter + 1;
            }
        }
        if (counter > 2) {
            System.out.println("Composite");
        } else {

            System.out.println("Prime");
        }
    }

    static long factorial(long number) {
        int x = 1;
        long result = 1;
        for (x = 1; x <= number; ++x) {
            result = x * result;
        }
        return result;
    }

    public void showfactorial(long number) {
        int x = 1;
        long result = 1;
        for (x = 1; x <= number; ++x) {
            result = x * result;
        }
        System.out.println(result);
    }

    static int[] sortNumbers(int[] a, char choice) {
        if (choice == 'a') {
            for (int x = 0; x <= a.length - 1; x++) {
                for (int f = 0; f <= a.length - 1; x++) {
                    if (a[f] > a[f + 1]) {
                        int temp = a[f];
                        int temp2 = a[f + 1];
                        a[f] = temp2;
                        a[f + 1] = temp;
                    }
                }
            }
            return a;
        }
        if(choice=='b'){
            for (int x = 0; x <= a.length - 1; x++) {
                for (int f = 0; f <= a.length - 1; x++) {
                    if (a[f] < a[f + 1]) {
                        int temp = a[f];
                        int temp2 = a[f + 1];
                        a[f] = temp2;
                        a[f + 1] = temp;
                    }
                }
            }
            return a;
        }
        else{
            System.out.println("Invalid choice type.");
            return a;
        }
    }
}
