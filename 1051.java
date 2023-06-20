import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    double s=rbt.nextDouble();
    if(s>=0 && s<=2000){
      System.out.println("Isento");
     }
    else if(s>=2000.01 && s<=3000){
      System.out.printf("R$ %.2f\n",((s-2000.01)*0.08));
     }
    else if(s>=3000.01 && s<=4500){
      System.out.printf("R$ %.2f\n",(((s-3000.01)*0.18)+80));
     }
    else if(s>4500){
      System.out.printf("R$ %.2f\n",(((s-4500)*0.28)+80+270));
     }
  }
}
