import java.util.*;
public class Swap
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n1,n2;
n1=in.nextInt();
n2=in.nextInt();
n1=n1+n2;
n2=n1-n2;
n1=n1-n2;
System.out.print(n1+" "+n2);
}
}
//INPUT:10 20
//OUTPUT:20 10