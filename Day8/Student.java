class Student{

int id;
String name;

Student(int i, String n){

this.id = id;
this.name = name;
}

void display(){System.out.println(id+" "+name);}

public static void main(String args[]){

Student s1 = new Student(11,"amudhav");
Student s2 = new Student(12,"visai");

s1.display();
s2.display();	

}

}

