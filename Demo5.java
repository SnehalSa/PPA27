

class Demo5
{
	public static void main(String arg[])
	{
	}
}
	interface Hello1
	{
		int i=10;
		void fun();

	class Hello2
	{
		public void gun()
		{
			System.out.println("Inside hello2 gun");
		}
	}
	class Marvellous extends Hello2 implements Hello1 //6
	{
		public void fun()
		{
			System.out.println("Inside fun");
		}
	}

