import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    for(int i=1; i<=n; i++)
    {
      String a=rbt.next();
      String b=rbt.next();
      if(a.equals("ataque") && b.equals("pedra")) System.out.println("Jogador 1 venceu");
      else if(a.equals("pedra") && b.equals("papel")) System.out.println("Jogador 1 venceu");
      else if(a.equals("papel") && b.equals("ataque")) System.out.println("Jogador 2 venceu");
      else if(a.equals("pedra") && b.equals("ataque")) System.out.println("Jogador 2 venceu");
      else if(a.equals("papel") && b.equals("pedra")) System.out.println("Jogador 2 venceu");
      else if(a.equals("ataque") && b.equals("papel")) System.out.println("Jogador 1 venceu");
      else if(a.equals("papel") && b.equals("papel")) System.out.println("Ambos venceram");
      else if(a.equals("pedra") && b.equals("pedra")) System.out.println("Sem ganhador");
      else if(a.equals("ataque") && b.equals("ataque")) System.out.println("Aniquilacao mutua");
    }
  }
}