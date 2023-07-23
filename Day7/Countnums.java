import java.util.Scanner;

class Countnums{

public static void main(String args[]){

Scanner in = new Scanner (System.in);
System.out.println("Enter a value:");
int n = in.nextInt();

int count = 0;

while(n>0){

int rem = n%10; //reminder of n
n=n/10;

if(rem==2){
count++;
}


}
System.out.print(count);


}

}