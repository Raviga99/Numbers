import java.util.*;
public class Semiprime
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int l,u,k=0,i,j,count,x=0,output=0,result=0;
int arr[]=new int[100];
l=in.nextInt();
u=in.nextInt();
for(i=2;i<=u/2;i++)
{
count=0;
for(j=2;j<=i;j++)
{
if(i%j==0)
count++;
}
if(count==1)
{
arr[k]=i;
k++;
x++;
}
}
for(k=0;k<x;k++)
System.out.println(arr[k]);
System.out.println(x);
for(i=0;i<x;i++)
{
for(j=i;j<x;j++)
{   
result=arr[i]*arr[j];
if(result>=l && result<=u)
output++;
}
}
System.out.print(output);
}
}
//INPUT:1   12
//OUTPUT:4
