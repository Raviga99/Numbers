import java.util.*;
public class Roman
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int  n;
n=in.nextInt();
String s = "";
while (n >= 1000)
{
s += "M";
n -= 1000;        
}
while (n >= 900)
{
s += "CM";
n -= 900;
}
while (n >= 500) 
{
s += "D";
n-= 500;
}
while (n >= 400) 
{
s += "CD";
n -= 400;
}
while (n>= 100) 
{
s += "C";
n -= 100;
}
while (n >= 90) 
{
s += "XC";
n -= 90;
}
while (n >= 50) 
{
s += "L";
n -= 50;
}
while (n >= 40) 
{
s += "XL";
n -= 40;
}
while (n>= 10) 
{
s += "X";
n -= 10;
}
while (n >= 9) 
{
s += "IX";
n -= 9;
}
while (n >= 5) 
{
s += "V";
n -= 5;
}
while (n >= 4) 
{
s += "IV";
n -= 4;
}
while (n>= 1) 
{
s += "I";
n -= 1;
}    
System.out.print(s);
}
}
//INPUT:9
//OUTPUT:IX