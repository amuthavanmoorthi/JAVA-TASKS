import java.util.Scanner;
import java.lang.*;

class kgm{

public static void main(String args[]){

Scanner sc = new Scanner (System.in);

System.out.println("Input 1st integer:");
int first = sc.nextInt();

System.out.println("Input 2nd integer:");
int second = sc.nextInt();

int Sum = first+second;
int Difference = first-second;
int Product = first*second;
double avg = (first+second)/2;

System.out.println("Sum of two integers:"+ Sum);
System.out.println("Difference of two integers:"+ Difference);
System.out.println("Product of two integers:"+ Product);
System.out.println("Average of two integers:"+ avg);
System.out.println("Distance of two integers:"+(Math.abs(first-second)));
System.out.println("Max integer:"+(Math.max(first,second)));
System.out.println("Min integer:"+(Math.min(first,second)));



}

}