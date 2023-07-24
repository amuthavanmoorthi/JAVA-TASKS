/* Write a Java program to print a prime numbers from 0 to 100

Input: 100

Output:

2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 */



class kgm{
    public static void main(String args[]){
        
        for (int i=1; i<=100; i++){
            int counter=0;
            for (int j=i; j>=1; j--){
                if(i%j==0){
                    counter = counter + 1;
                }
                }
                if(counter == 2){
                    System.out.print(i+" ");
            }
            
        }
    }
}



}
}
