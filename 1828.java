import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt= new Scanner(System.in);
    int t=rbt.nextInt();
    for(int i=1; i<=t; i++)
    {
      String x=rbt.next();
      String y=rbt.next();
      if(x.equals(y))
        System.out.println("Caso #"+i+": De novo!");
      else if(x.equals("tesoura") && (y.equals("papel") || y.equals("lagarto")))
        System.out.println("Caso #"+i+": Bazinga!");
      else if(x.equals("papel") && (y.equals("pedra") || y.equals("Spock")))
        System.out.println("Caso #"+i+": Bazinga!");
      else if(x.equals("pedra") && (y.equals("lagarto") || y.equals("tesoura")))
        System.out.println("Caso #"+i+": Bazinga!");
      else if(x.equals("lagarto") && (y.equals("Spock") || y.equals("papel")))
        System.out.println("Caso #"+i+": Bazinga!");
      else if(x.equals("Spock") && (y.equals("tesoura") || y.equals("pedra")))
        System.out.println("Caso #"+i+": Bazinga!");
      else 
        System.out.println("Caso #"+i+": Raj trapaceou!");
    }
  }
}