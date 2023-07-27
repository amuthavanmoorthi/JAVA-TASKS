//Java Exception Handling

public class javaExceptionHandlingExample{
	public static void main(String args[]){
try{
	//code that may raise exception
	int date = 100/0;
}
catch(Exception e){

//System.out.println(e);

e.printStackTrace();

}

//rest code of the program
System.out.println("rest of the code...");


}
}