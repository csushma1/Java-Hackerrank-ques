import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Program_2
{
//count variable keeps tracks of the number of factors
//if count==0 then its a prime number, else its not a prime 
public void test_prime(int n)
{
int i = 0,count = 0,j = 0;
for(i = 1;i <= n; i++)
{
for(j = 2;j <= (int)Math.sqrt(i); i++)
{
if(i%j == 0)
{
count++;
}
}
if(count == 0)
{
System.out.println("It is a prime ");
}
else
{
System.out.println("It is not a prime number");
}
}
}
}

public static void main(String[] args)

{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int a = 1; a <= n; a++)
{
int num = sc.nextInt();
test_prime(int num);
}

}









}