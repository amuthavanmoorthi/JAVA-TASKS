import java.lang.Math;

class MathExample{

	public static void main(String args[]){
 	
//Gives the absolute value of the data.
	System.out.println("abs():" + Math.abs(-12.2));	

//cube root of the given value
	System.out.println("cbrt():" + Math.cbrt(8));

//square root of the given value.
	System.out.println("sqrt():" + Math.sqrt(4));

//sign of your number plus or minus.
	System.out.println("signum():" + Math.signum(12.2));

//it will come rounded value.
	System.out.println("rint():" + Math.rint(-1.6));

//rint another example.
System.out.println("rint():" + Math.rint(-0.6));

//minus value will decrease and plus value will increase.
	System.out.println("ceil():" + Math.ceil(-0.87));

//another example for ceiling.
System.out.println("ceil():" + Math.ceil(0.87));


//negative value will increase and positive value will decrease.
	System.out.println("floor():" + Math.floor(1.6));

//another example for floor.
System.out.println("floor():" + Math.floor(-0.2));

//random value will generate from 0 to 1.
System.out.println("random():" + Math.random());	

//pow is first value is num and second value is pow.
System.out.println("pow():" + Math.pow(5,2));	

//comparing two value and getting max value.
System.out.println("max():" + Math.max(-2,2));

//comparing two value and getting min value.
System.out.println("min():" + Math.min(1,2));	

//first value will come and the second value sign will come.
System.out.println("copySign():" + Math.copySign(-5,2));


System.out.println("exp():" + Math.exp(2));

System.out.println("expm1():" + Math.expm1(2));

System.out.println("getExponent():" + Math.getExponent(3));

//Pythagorean theorem.
System.out.println("hypot():" + Math.hypot(3,2));

System.out.println("IEEEremainder():" + Math.IEEEremainder(6,16));

System.out.println("nextAfter():" + Math.nextAfter(6,2));

System.out.println("nextUp():" + Math.nextUp(-8.5));

System.out.println("round():" + Math.round(-6.3));

System.out.println("acos():" + Math.acos(-1));

System.out.println("asin():" + Math.asin(-1));

System.out.println("atan():" + Math.atan(-1));

System.out.println("atan2():" + Math.atan2(1,2.5));

System.out.println("cos():" + Math.cos(13));

System.out.println("cosh():" + Math.cosh(3));

System.out.println("log():" + Math.log(10));

System.out.println("log10():" + Math.log10(10));

System.out.println("log1p):" + Math.log1p(10));


System.out.println("sin():" + Math.sin(0.2));

System.out.println("sinh():" + Math.sinh(2.5));

System.out.println("tan():" + Math.tan(2.5));

System.out.println("tanh():" + Math.tanh(2.5));

//3.14
System.out.println("toDegrees():" + Math.toDegrees(45));

System.out.println("toRadians():" + Math.toRadians(45));

//Unit of least precison
System.out.println("ulp():" + Math.ulp(1234.567));




}

}