class Example{

private static String str = "Have a nice day";
static class Exp 
{

public void display(){

System.out.println(str);

}

}
public static void main(String args[]){

Example.Exp obj = new Example.Exp();

obj.display();

}

}