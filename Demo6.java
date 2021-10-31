class Demo6
{
	public static void main(String arg[])
	{

	}
}
interface Base
{
	
	void fun();
}
interface Derived extends Base//4
{
	void gun();
}

class Marvellous implements Derived //4
{
	public void fun()
	{
		System.out.println("Inside fun");
	}
}