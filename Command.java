import java.util.Scanner;

class Command
{
	public static void main(String arg[])
	{
		System.out.println("Total number of arguments are:"+arg.length);//referance asto
		System.out.println("Command line arguments are:");

		for(int i=0;i<arg.length;i++)
		{
			System.out.println(arg[i]);
		}
	}
}