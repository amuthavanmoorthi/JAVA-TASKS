import java.util.Scanner;

class two{

public static void main(String args[])
{

Scanner sc = new Scanner (System.in);


System.out.println("Enter your first name:");
String firstName = sc.nextLine();


System.out.println("Enter your last name:");
char lastName = sc.next().charAt(0);


System.out.println("Enter your age:");
int age = sc.nextInt();
sc.nextLine();

System.out.println("Enter your email:");
String email = sc.nextLine();


System.out.println("Your first name =" +firstName);
System.out.println("You initial is =" +lastName);
System.out.println("You age" +age);
System.out.println("Your email" +email);

}
}