import java.io.*;
import java.util.*;
class vowel
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char a=sc.next();
char ch=a.equalsIgnorecase();
if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("constant");
}
}
}
