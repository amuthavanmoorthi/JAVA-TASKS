public class NestedTryBlock
{
	public static void main(String args[]){

//Outer try block


try{

//inner try block 1

try{
System.out.println("going to divide by 0");
int b=39/0;
}
//catch block of inner try block 1

catch(ArithmeticException e)
{
	System.out.println(e);
}
try{
int a[]=new int[5];
//assignning the value out of array bounds
a[5]=4;
}

//catch block of inner try block 2

catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
System.out.println("Other statement");
}
//Catch block of outer try block
catch(Exception e)
{
System.out.println("handle the exception(outer catch)");
}
System.out.println("normal flow...");
}
}