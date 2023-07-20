/* Write a Java program to print a prime numbers from 0 to 100

Input: 100

Output:

2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 */

class kgm{
public static void main(String args[]){

int count = 0;

	for (int i = 1; i <= 100; i++){

	 	if (i % 1==0){
		count++;
		}

	if (count == 2){
		System.out.println(count);
}
}

}
}
