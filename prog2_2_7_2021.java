import java.util.*;
class Two
{
public static void main(String args[])
{
int i,j,k,l;
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println(" ");
}
for(k=1;k<=n;k++)
{
for(l=k;l<=n;l++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}

