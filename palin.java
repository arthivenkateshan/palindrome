import java.util.*;
import java.io.*;
class palin
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
while(n!=0)
{
 int m=n%10;
 sum+=m;
 n=n/10;
}
boolean b=isPalindrome(sum);
if(b==true)
System.out.println("palindrome");
else
System.out.println(" not palindrome");
}
public static boolean isPalindrome(int x) {
    if (x < 0)
        return false;
    int div = 1;
    while (x / div >= 10) {
        div *= 10;
    }
    while (x != 0) {
        int l = x / div;
        int r = x % 10;
        if (l != r)
            return false;
        x = (x % div) / 10;
        div /= 100;
    }
    return true;
}
}
 