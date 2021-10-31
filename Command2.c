#include<stdio.h>
#include<stdlib.h> //atoi

int main(int argc,char *argv[])
{
	int no1=0;int no2=0;int ans=0;
	printf("Total number of command line argument are:%d\n",argc);
if(argc==3)
{
	no1=atoi(argv[1]);  //ASCII to integer
	no2=atoi(argv[2]);
	ans=no1%no2;
	printf("Addition is :%d\n",ans);
}




	return 0;
}