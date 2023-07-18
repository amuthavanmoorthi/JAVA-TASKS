import java.util.Scanner;

class task1

{

public static void main(String args[])

{

Scanner task = new Scanner(System.in);

System.out.println("Hello World");

int a = 5, b=5;
System.out.println("Addition =" +(a+b));

System.out.println("Enter you first number:");
int first_number = task.nextInt();
task.nextLine();

System.out.println("Enter your second number:");
int second_number = task.nextInt();
task.nextLine();

System.out.println("You product number = "+ (first_number*second_number));

System.out.println("Arithmetic operators");

int num1 = 2, num2 = 4;
System.out.println("Addition = " +num1+num2);
System.out.println("Subraction = "+ (num1-num2));
System.out.println("Multiplication = " +num1*num2);
System.out.println("Divison = " +num1/num2);
System.out.println("Modulas = " +num1%num2);

int ab=5, ac=10, ad=5, ae=5, af=5, g=ab+ac+ad+ae+af, h=g/5;
System.out.println(h);

System.out.println("Area of Circle");
int r=3;
System.out.println(22/7*(r*r));

System.out.println("Are od Rectangle");
double length = 10;
double width = 12;

double area = length*width;
System.out.println(area);

System.out.println("Area of triangle");
double base = 12;
double height = 32;

System.out.println((base*height)/2);

System.out.println("Area of Equilateral triangle");
int equi=5;
System.out.println((1.73*equi*equi)/4);


System.out.println("area of rhombus");
int diagonal1=10;
int diagonal2=12;
System.out.println((diagonal1*diagonal2)/2);


System.out.println("area of parallelogram");
System.out.println(base*height);

System.out.println("area of prism");
int perimetor=10;
System.out.println((2*base)+(perimetor*height));

System.out.println("volume of sphere");
System.out.println((4/3)*(22/7)*(r*r*r));


System.out.println("volume of cylinder");
System.out.println((22/7)*(r*r)*height);

System.out.println("Concatenate two strings");
System.out.println("Thank"+"You!");

}
}