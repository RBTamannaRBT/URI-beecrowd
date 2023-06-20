import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    boolean stop=false;
    int a=0, g=0, d=0;
    while(!stop){
      int code=rbt.nextInt();
      if(code==1){
        a++;
      }
      else if(code==2){
        g++;
      }
      else if(code==3){
        d++;
      }
      else if(code==4){
        stop=true;
      }
    }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+a);
    System.out.println("Gasolina: "+g);
    System.out.println("Diesel: "+d);
  }
}