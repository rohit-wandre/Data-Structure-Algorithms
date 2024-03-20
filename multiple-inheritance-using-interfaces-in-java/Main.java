interface one
{
    public void printHi();
}

interface two
{
    public void hello();
}

interface three extends one,two
{
    public void printHi();
}

class Child implements three
{
    public void printHi()
    {
        System.out.println("Hi");
    }
    public void hello()
    {
        System.out.println("Hello");
    }
}


public class Main
{
	public static void main(String[] args) {
		Child c=new Child();
		c.printHi();
		c.hello();
		c.printHi();
		
		
	}
}
