class StringExample{

	public static void main(String args[]){

 	String str = "Batch-17 is toppers";

	//To check whether the string object contains given value or not.
	System.out.println(str.contains("Toppers"));

	//To check whether the string object equals given value or not.
	System.out.println(str.equals("Batch-17 is toppers"));

	//IsIgnoreCase will ignore the lowercase and uppercase otherwise it will work.
	System.out.println(str.equalsIgnoreCase("Batch-17 is Toppers"));
	
	//To add some value after the toppeers string.
	System.out.println(str.concat(", but sometimes \"joking\""));

	//it will change the string into lowercase.
	System.out.println(str.toLowerCase());

	//it will change the string into uppercase.
	System.out.println(str.toUpperCase());

	//Counting how char are there in the str.
	System.out.println(str.length());

	//Finding the char value.
	System.out.println(str.charAt(10));

	/* comparing to our string value if there is some wrong it will false that false is       small letter it will give minus value and if capital value it will give plus value. */ 
	System.out.println("compareTo(): " + str.compareTo("joking")); 
	
	//It will check only space value if there is space it will give minus value. 
	System.out.println("compareToIgnoreCase(): " + str.compareToIgnoreCase("joking")); 

	//finding the char of index. 
	System.out.println("indexOf(): " + str.indexOf(9)); 

	//if there is empty it will true if you have value it will false. 
	System.out.println("isEmpty(): " + str.isEmpty()); 

	//replace only one string to string. 
	System.out.println("replace(): " + str.replace("joking","hard to live")); 

	//it will get the 9 to 12 char value. 
	System.out.println("substring(): " + str.substring(9,12)); 

	//trim will remove the space frist and last. 
	System.out.println("trim(): " + str.trim()); 

	//hashcode generate the primary value for our code. 
	System.out.println("hashCode(): " + str.hashCode()); 

	//it's changing int value to decimal. 
	System.out.println("format(): " + String.format("%d",5)); 

	//first value is splitter, after that will join and come. 
	System.out.println("join(): " + String.join("*","amudhavan","aravind")); 

	//it will replace all for given value. 
	System.out.println("replaceAll(): " + str.replaceAll("i", "d")); 

	//mam will teach in if statement. 
	//System.out.println("split(): " + str.split());
}
}