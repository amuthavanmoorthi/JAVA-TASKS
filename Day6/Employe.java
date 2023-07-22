//static in real time
// full stack is company
// mam is a static 
// after complete course 30k salary for everyone - static.

class Employe{

int eid;
String ename;
long phno;
static String mgr = "Banu";
static int salary = 30000;

//constructor passing
Employe(int eid,String ename, long phno, String mgr){

//this is mean current.

this.eid = eid;
this.ename = ename;
this.phno = phno;
this.mgr = mgr;

}

void display(){
System.out.println("id:" +eid +"ename:"+ ename +"phno :" + phno +"mgr:"+ mgr+ "salary:"+ salary+incentive);
}

static void incentive(){
System.out.println(salary+(salary*10/100));
}

public static void main(String args[])
{
Employe Ammu = new  Employe(501,"amudhavan",93600853l,"Banu");
Employe Aravind = new  Employe(502,"Aravind",3298488l,"Banu");
Employe Hari = new  Employe(503,"Hari Kumar",3299879l,"Banu");

//Constructor calling
Ammu.display();
Aravind.display();
Hari.display();
//incentive.display();

}


} 