import java.util.Scanner;
public class dateproject {
    static String returnint(double number){
        int num1=(int)number;
            if(number-num1==0.0){
                return "int";
            }
            else{
                return "double";
            }

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("First date should be smaller.");
        System.out.println("FIRST DATE:");
        System.out.print("day:");
        int days=input.nextInt();
        System.out.print("month");
        int months=input.nextInt();
        System.out.print("years:");
        int years=input.nextInt();
        System.out.println("SECOND DATE:");
        System.out.print("day:");
        int days2=input.nextInt();
        System.out.print("month:");
        int months2=input.nextInt();
        System.out.print("year:");
        int years2=input.nextInt();
        int leap=0;
        int daydiff=0;
        int monthdiff=0;
        int yeardiff=0;
        if(days>days2){
            daydiff=days-days2;
        }
        if(days2>days){
            daydiff=days2-days;
        }
        if(months>months2){
            monthdiff=months-months2;
        }
        if(months2>months){
            monthdiff=months2-months;
        }
       if(years>years2) {
           yeardiff=years-years2;
       }
       if(years2>years){
           yeardiff=years2-years;
       }
       double yearcheck=yeardiff/4;
       if(returnint(yearcheck).equals("int")){
           leap=(int)yearcheck;
       }
       if(returnint(yearcheck).equals("double")){
           leap=(int)yearcheck;
       }
       int daysfinal=daydiff+leap;
       double monthfinal=monthdiff*30.417;
       int yearfinal=yeardiff*365;
       double days1=daysfinal+monthfinal+yearfinal;
       System.out.println(days1 + " days");
    }
}
