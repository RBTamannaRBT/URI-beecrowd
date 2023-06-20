import java.util.Scanner;
public class Main
{
  public static void main(String[] args) 
  {
    Scanner rbt = new Scanner(System.in);
    int n=rbt.nextInt();
    int a=0,b=0,c=0,d=0;
    for(int i=1; i<=n; i++)
    {
      int l=rbt.nextInt();
      if(l%2==0)
      {
        a++;
      }
       if(l%3==0)
      {
        b++;
      }
       if(l%4==0)
      {
        c++;
      }
       if(l%5==0)
      {
        d++;
      }
    }
    System.out.println(a+" Multiplo(s) de 2");
    System.out.println(b+" Multiplo(s) de 3");
    System.out.println(c+" Multiplo(s) de 4");
    System.out.println(d+" Multiplo(s) de 5");
  }
}