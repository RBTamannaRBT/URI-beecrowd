import java.util.Scanner;
public class Main {
  
  public static void main(String[] args){
    
    Scanner rbt=new Scanner(System.in);
    double n=rbt.nextDouble();
    int temp = (int)n*100;
  int rem = (int)(n*100 )-temp;
    int n1=(int)( n/100);
    double r1=n%100;
    int n2=(int)(r1/50);
    double r2=r1%50;
    int n3=(int)(r2/20);
    double r3=r2%20;
    int n4=(int)(r3/10);
    double r4=r3%10;
    int n5=(int)(r4/5);
    double r5=r4%5;
    int n6=(int)(r5/2);
    double r6=r5%2;
    int c1=(int)(r6/1);
    double r7=r6%1;
    double rr=r7*100;
    int c2=(int)(rem/50);
    double r8=rem%50;
    int c3=(int)(r8/25);
    double r9=r8%25;
    int c4=(int)(r9/10);
    double r10=r9%10;
    int c5=(int)(r10/5);
    double r11=r10%5;
    int c6=(int)(r11/1);
    System.out.println("NOTAS:");
    System.out.println(n1+" nota(s) de R$ 100.00");
    System.out.println(n2+" nota(s) de R$ 50.00");
    System.out.println(n3+" nota(s) de R$ 20.00");
    System.out.println(n4+" nota(s) de R$ 10.00");
    System.out.println(n5+" nota(s) de R$ 5.00");
    System.out.println(n6+" nota(s) de R$ 2.00");
    System.out.println("MOEDAS:");
    System.out.println(c1+" moeda(s) de R$ 1.00");
    System.out.println(c2+" moeda(s) de R$ 0.50");
    System.out.println(c3+" moeda(s) de R$ 0.25");
    System.out.println(c4+" moeda(s) de R$ 0.10");
    System.out.println(c5+" moeda(s) de R$ 0.05");
    System.out.println(c6+" moeda(s) de R$ 0.01");
  }
  
}