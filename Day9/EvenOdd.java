import java.util.Scanner;
public class EvenOdd
{

//User defined method
public static void findEvenOdd(int num)

{
//method body
if(num%2==0)
System.out.println(num+"is Even");
else
System.out.println(num+"is Odd");
}

public static void main(String args[]){

//Creating Scanner class object
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number:");

//reading the value from the user'
int num = scan.nextInt();

//method calling
findEvenOdd(num);

}
}