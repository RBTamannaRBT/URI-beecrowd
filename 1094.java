import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    int t=0,c=0,r=0,s=0;
    for(int i=1; i<=n; i++)
    {
    int amount=rbt.nextInt();
    String type=rbt.next();
    t+=amount;
    if(type.equals("C"))
      c+=amount;
   else if(type.equals("R"))
      r+=amount;
   else if(type.equals("S"))
      s+=amount;
    }
    double cp=((c*100)/(double)t);
    double rp=((r*100)/(double)t);
    double sp=((s*100)/(double)t);
    System.out.println("Total: "+t+" cobaias");
    System.out.println("Total de coelhos: "+c);
    System.out.println("Total de ratos: "+r);
    System.out.println("Total de sapos: "+s);
    System.out.printf("Percentual de coelhos: %.2f",cp);
    System.out.println(" %");
    System.out.printf("Percentual de ratos: %.2f",rp);
    System.out.println(" %");
    System.out.printf("Percentual de sapos: %.2f",sp);
    System.out.println(" %");
  }
}