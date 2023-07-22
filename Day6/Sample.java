class Sample{

//Static won't take seperate object it will combine the object.

static int count = 0;

Sample(){

	count++;
	System.out.println(count);

}
public static void main(String args[]){

Sample amudhavan = new Sample ();
Sample hari = new Sample ();
Sample aravind = new Sample();

System.out.println(args [3] + args [0]);
}

}