
class AbstractDemo
{
	public static void main(String arg[])
	{
		//Demo obj=new Demo();  Error
		Demo obj; //Allowed
		obj=new Hello();  //Upcasting
		obj.fun();  ///fun of hello
		obj.gun();  //gun of demo
		obj.sun();  //sun of hello
		System.out.println(obj.i);  //10
		System.out.println(obj.j);  //20
 


	}
}
  abstract class Demo
{
	public int i,j;
	public Demo()
	{
       System.out.println("Inside constructor of Demo");
	}
	public void fun()
	{
      System.out.println("Inside fun of Demo");
	}
    public void gun()
	{
       System.out.println("Inside gun of Demo");
	}
	public abstract void sun();  //no body  //virtual void sun()=0;
	
}
class Hello extends Demo
{
	public int x,y;
	public Hello()
	{
		System.out.println("Inside constructor of Hello");
		x=10;
		y=20;

	}
	public void fun()         //overriding
	{
		System.out.println("Inside fun of Hello");
	}
    public void sun()  //Defination //bez above has no body
    {
    	System.out.println("Inside sun of Demo");
    }
}