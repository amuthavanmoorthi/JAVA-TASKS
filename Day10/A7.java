//Multiple Inheritance

interface Printable{
void print();
}

interface Showable{
void show();

}

class A7 implements Printable,Showable 
{
public void print(){System.out.print("Hello");}
public void show(){System.out.print("Welcoome");}

public static void main(String args[]){
A7 obj = new A7();
obj.print();
obj.show();

}

}