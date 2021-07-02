import java.util.*;
class Three
{
public static void main(String args[])
{
int i,j;
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=i;j<=n;j++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}
