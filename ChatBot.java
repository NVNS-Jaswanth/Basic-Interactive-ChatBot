import java.util.*;
public class ChatBot {
    public static void main(String[] args) 
    { 
      int b=400;

      Scanner sc=new Scanner(System.in);
      System.out.println("\nHello..What is your name?");
      String name=sc.nextLine();

      System.out.println("\nHi "+ name +"! I'm Javabot. Where are you from?");
      String place=sc.nextLine();

      System.out.println("\nI hear it's beautiful at "+ place +"! I'm from a place called Oracle");
      System.out.println("\nHow old are you?");
      int age=sc.nextInt();

      System.out.println("\nSo you're "+ age +" cool! I'm "+ b +" years old.");
      System.out.println("\nThis means I'm "+ (b/age) + " times older than you.");
      System.out.println("\nEnough about me. What's your fav language? (just dont't say Python!)");
      sc.nextLine();
      String langee =sc.nextLine();

      System.out.println("\n" +langee +", fair enough! Frome how many years you are using  "+ langee );
      int year =sc.nextInt();
      System.out.println("\n "+ year +" years eh? That's great, keep it up!");
      System.out.println("\n Nice chatting with you "+ name + ". See ya!");
      sc.close();



    }
    
}
