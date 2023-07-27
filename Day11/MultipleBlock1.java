public class MultipleBlock1{
	public static void main(String [] args){
try{
	int a[]= new int[5];
	a[5]=30/0;
}
catch(ArithmeticException e){
System.out.println("Arithmetic expression occurs");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array Out of Bounds Exception occurs");
}
catch(Exception e){
System.out.println("Parent exception occurs");
}

System.out.println("Rest of the code");
}
}