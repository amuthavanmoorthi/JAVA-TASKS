class TestOverloading4{

public static void main(String [] args)
{
System.out.println("main with string[]");
}

public static void main(String args)
{
System.out.println("main with string");
}

public static void main()
{
System.out.println("main without string");
}

}