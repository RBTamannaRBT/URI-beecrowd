import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    float s=rbt.nextFloat();
    if(s>=0 && s<=400){
      System.out.printf("Novo salario: %.2f\n",(s+s*0.15));
      System.out.printf("Reajuste ganho: %.2f\n",(s*0.15));
      System.out.println("Em percentual: 15 %");
    }
    if(s>=400.01 && s<=800){
      System.out.printf("Novo salario: %.2f\n",(s+s*0.12));
      System.out.printf("Reajuste ganho: %.2f\n",(s*0.12));
      System.out.println("Em percentual: 12 %");
    }
    if(s>=800.01 && s<=1200){
      System.out.printf("Novo salario: %.2f\n",(s+s*0.10));
      System.out.printf("Reajuste ganho: %.2f\n",(s*0.10));
      System.out.println("Em percentual: 10 %");
    }
    if(s>=1200.01 && s<=2000){
      System.out.printf("Novo salario: %.2f\n",(s+s*0.07));
      System.out.printf("Reajuste ganho: %.2f\n",(s*0.07));
      System.out.println("Em percentual: 7 %");
    }
    if(s>2000){
      System.out.printf("Novo salario: %.2f\n",(s+s*0.04));
      System.out.printf("Reajuste ganho: %.2f\n",(s*0.04));
      System.out.println("Em percentual: 4 %");
    }
  }
}