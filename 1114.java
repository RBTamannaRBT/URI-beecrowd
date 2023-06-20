import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    boolean stop=false;
    while(!stop){
      int n=rbt.nextInt();
      if(n==2002){
        System.out.println("Acesso Permitido");
        stop=true;
      }
      else {
        System.out.println("Senha Invalida");
      }
    }
  }
}