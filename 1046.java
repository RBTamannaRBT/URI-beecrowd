import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int s=rbt.nextInt();
    int e=rbt.nextInt();
    int d=e-s;
    if(d>0){
      System.out.println("O JOGO DUROU "+d+" HORA(S)");
    }
    if(d<=0){
      System.out.println("O JOGO DUROU "+(d+24)+" HORA(S)");
    }
  }
}