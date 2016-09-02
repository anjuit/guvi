import java.util.*;
class Single
{
public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the size");
 int n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++)
  a[i]=sc.nextInt();
  int c=0;
  for(int i=0;i<n;i++)
  {
  for(int j=i+1;j<n;j++)
  {
   if(a[i]==a[j])
    c++;
    }
    if(c==0)
   System.out.println(a[i]);
   c=0;
  }
  }
  }
