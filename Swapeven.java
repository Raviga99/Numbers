import java.util.*;
public class Swapeven
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j=0,rem=0,l,result=0,l1;
double sum=0;
char temp;
String str="";
String str2="0";
n=in.nextInt();
while(n>0)
{
rem=n%2;
str=rem+str;
n=n/2;
}
l=str.length();
if(l%2!=0)
{
str2=str2+str;
}
System.out.println(str2);
l1=str2.length();
char ch[]=str2.toCharArray();
for(i=0;i<l1-1;i++)
{
temp=ch[i+1];
ch[i+1]=ch[i];
ch[i]=temp;
i++;
}
String str1=new String(ch);
System.out.println(str1);
char ch1[]=str1.toCharArray();
for(i=str1.length()-1;i>=0;i--)
{
sum=sum+(Character.getNumericValue(ch1[i]))*(Math.pow(2,j));
j++;
}
result=(int)sum;
System.out.println(result);
}
}
//INPUT:170
//OUTPUT:85