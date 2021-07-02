import java.util.*;
class one
{
public static void main(String args[])
{
int i,j;
int N;
Scanner sc=new Scanner(System.in);
System.out.println("Enter N value");
N=sc.nextInt();
char ch='A';
for(i=1;i<=N;i++)
{
for(j=1;j<=i;++j)
{
System.out.print(ch+" ");
ch++;
}
System.out.println(" ");
}
}
}