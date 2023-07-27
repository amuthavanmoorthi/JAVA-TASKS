class Bank{
	float getRateOfInterest(){return 0;}
}
class SBI{
	float getRateOfInterest(){return 8.4f;}
}
class ICICI{
	float getRateOfInterest(){return 7.3f;}
}
class AXIS{
	float getRateOfInterest(){return 9.7f;}
}

class TestPolymorphism1{
public static void main(String args[]){
SBI i;
ICICI k;
AXIS j;

SBI = new SBI();
System.out.println("SBI Rate of Interest:" + i.getRateOfInterest());

ICICI=new ICICI();
System.out.println("ICICI  Rate of Interest:" + k.getRateOfInterest());

AXIS=new AXIS();
System.out.println("AXIS Rate of INterest:" + j.getRateOfInterest());

}
}