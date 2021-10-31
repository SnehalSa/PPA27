class DemoString
{
	public static void main(String arg[])
	{
		String str1="Hello";

		String str2=new String("Hello");

		char Arr[]={'H','E','L','L','O'};

		String str3=new String(Arr);

		System.out.println(str1);

		System.out.println(str2);

		System.out.println(str3);

		System.out.println("String Length is:"+str1.length());//length method thats why ()


		System.out.println("Array length is :"+Arr.length);//length property that why no ()
         //immutable=constat
         //ways to allocate string
		String s1="Demo";//String litral pool//memory wachte//outside heap
		String s2="Demo";
		String s3="Demo";

		String s4=new String("Demo");//String objects//Heap
		String s5=new String("Demo");
		String s6=new String("Demo");

		for(int j=0;j<s6.length();j++)
		{
		 System.out.println(s6.charAt(j)); //1 way
		}

		System.out.println(s6.charAt(0)); //1 way

         System.out.println(s6.charAt(3)); //1 way

         		char Brr[]=s6.toCharArr();//2nd way
         		for(int i=0;i<Brr.length;i++)
         		{
         			System.out.println(Brr[i]);
         		}


	}
}