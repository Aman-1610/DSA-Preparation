
import java.util.Scanner;
public class String_Example {
    public static void main(String args[])
    {
        String message=greet();//calling the greet method which is returning string here we are storing the returned value in different variable
        System.out.println(message);

        Scanner sc=new Scanner(System.in);
       // System.out.print("Enter your name: ");
        //String name=sc.next();
       // String personalised = myGreet(name);//calling method with passing a parameter 
       String personalised = myGreet("Aman Kumar");
        System.out.println(personalised);
    }
    static String myGreet(String name)//parameter called from the main class
    {
        String message="Hello " + name;//greeting message joined with the parameter 
        return message;//returned the string message when it is called 
    }
    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
