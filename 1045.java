import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    double a=rbt.nextDouble();
    double b=rbt.nextDouble();
    double c=rbt.nextDouble();
    if(a>b && a>c){
      if(c>b){
        double t=b;
        b=c;
        c=t;
      }
    }
    if(b>c && b>a){
      double temp=a;
      a=b;
      b=temp;
      if(c>b){
        double t=b;
        b=c;
        c=t;
      }
    }
    if(c>a && c>b){
      double temp=a;
      a=c;
      c=temp;
      if(c>b){
        double t=b;
        b=c;
        c=t;
      }
    }
    
    if(a>=(b+c)){
      System.out.println("NAO FORMA TRIANGULO");
    }
    else{
      if((a*a)==((b*b)+(c*c))){
        System.out.println("TRIANGULO RETANGULO");
      }
      if((a*a)>((b*b)+(c*c))){
        System.out.println("TRIANGULO OBTUSANGULO"); 
      }
      if((a*a)<((b*b)+(c*c))){
        System.out.println("TRIANGULO ACUTANGULO"); 
      }
      if(a==b && a==c){
        System.out.println("TRIANGULO EQUILATERO"); 
      }
      if((a==b && a!=c) || (b==c && b!=a) || (c==a && c!=b)){
        System.out.println("TRIANGULO ISOSCELES"); 
      }
    }
  }
}
