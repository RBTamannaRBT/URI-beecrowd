import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int c=rbt.nextInt();
    if(c==61){
    System.out.println("Brasilia");
    }
    if(c==71){
    System.out.println("Salvador");
    }
    if(c==11){
    System.out.println("Sao Paulo");
    }
    if(c==21){
    System.out.println("Rio de Janeiro");
    }
    if(c==32){
    System.out.println("Juiz de Fora");
    }
    if(c==19){
    System.out.println("Campinas");
    }
    if(c==27){
    System.out.println("Vitoria");
    }
    if(c==31){
    System.out.println("Belo Horizonte");
    }
    if(c!=61 && c!=71 && c!=11 && c!=21 && c!=32 && c!=19 && c!=27 && c!=31){
    System.out.println("DDD nao cadastrado");
    }
  }
}
