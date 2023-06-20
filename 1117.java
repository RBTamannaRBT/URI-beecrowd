import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    boolean stop=false;
    int c=0;
    double sum=0;
    while(!stop){
      float a=rbt.nextFloat();
      if(a>=0 && a<=10){
        sum+=a;
        c++;
      }
      else{
        System.out.println("nota invalida");
      }
      if(c==2){
        stop=true;
      }
    }
    System.out.printf("media = %.2f\n",sum/c);
  }
}