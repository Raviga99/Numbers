import java.util.*;
public class Multiply
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int a,b,i,result=0;
a=in.nextInt();
b=in.nextInt();
for(i=1;i<=a;i++)
{
result=result+b;
}
System.out.print(result);
}
}
//INPUT:4   7
//OUTPUT:28