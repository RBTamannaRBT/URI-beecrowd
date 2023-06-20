import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    boolean tham=false;
    int t=0,in=0,ge=0,d=0;
    while(!tham)
    {
      int i=rbt.nextInt();
      int g=rbt.nextInt();
      t++;
      if(i>g)
      {
        in++;
      }
      else if(i<g)
      {
        ge++;
      }
      else if(i==g)
      {
        d++;
      }
      for(int j=0; j<1; j++)
      {
        System.out.println("Novo grenal (1-sim 2-nao)");
        int x=rbt.nextInt();
        if(x==1)
        {}
        else if(x==2)
        {
          tham=true;
        }
        else
        {
          j--;
        }
      }
    }
    System.out.println(t+" grenais");
    System.out.println("Inter:"+in);
    System.out.println("Gremio:"+ge);
    System.out.println("Empates:"+d);
    if(in>ge)
    {
      System.out.println("Inter venceu mais");
    }
    else if(in<ge)
    {
      System.out.println("Gremio venceu mais");
    }
    else if(in==ge)
    {
      System.out.println("Não houve vencedor");
    }
  }
}