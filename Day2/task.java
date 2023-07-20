import java.util.Scanner;

class task{

public static void main(String args[]){

Scanner login = new Scanner(System.in);

System.out.println("Enter your first name:");
String first_name = login.nextLine();

System.out.println("Enter your last name:");
char last_name = login.next().charAt(0);

System.out.println("Enter your Mail Id:");
String email = login.next();

System.out.println("Enter your mobile number:");
long mobile = login.nextLong();
login.nextLine();

System.out.println("Enter your password:");
String password = login.next();

System.out.println("Your First Name = "+ first_name);
System.out.println("Your last Name = "+ last_name);
System.out.println("Your email = "+ email);
System.out.println("Your mobile number = "+ mobile);
System.out.println("Your password= "+ password);

}
}