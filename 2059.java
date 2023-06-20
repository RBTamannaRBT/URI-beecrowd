import java.util.Scanner;
public class Main
{
  public static void main(String[] args) 
  {
    Scanner rbt = new Scanner(System.in);
    int p=rbt.nextInt();
    int j1=rbt.nextInt();
    int j2=rbt.nextInt();
    int r=rbt.nextInt();
    int a=rbt.nextInt();
    if(r==1 && a==1)
    {
      System.out.println("Jogador 2 ganha!");
    }
    else if(r==1 && a==0)
    {
      System.out.println("Jogador 1 ganha!");
    }
    else if(r==0 && a==1)
    {
      System.out.println("Jogador 1 ganha!");
    }
    else if(r==0 && a==0)
    {
      if(((j1+j2)%2==0 && p==1) || ((j1+j2)%2!=0 && p==0))
      {
        System.out.println("Jogador 1 ganha!");
      }
      else
      {
        System.out.println("Jogador 2 ganha!");
      }
    }
  }
}