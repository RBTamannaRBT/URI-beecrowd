import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int cpo=rbt.nextInt();
    int upo=rbt.nextInt();
    float ppo=rbt.nextFloat();
    int cpt=rbt.nextInt();
    int upt=rbt.nextInt();
    float ppt=rbt.nextFloat();
    double total=(upo*ppo)+(upt*ppt);
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
  }
}