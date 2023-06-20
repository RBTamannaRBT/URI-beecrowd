import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    float n1=rbt.nextFloat();
    float n2=rbt.nextFloat();
    float n3=rbt.nextFloat();
    float n4=rbt.nextFloat();
    float a=(n1*2+n2*3+n3*4+n4*1)/(2+3+4+1);
    System.out.printf("Media: %.1f\n", a);
    if(a>=7){
      System.out.println("Aluno aprovado.");
    }
    if(a<5){
      System.out.println("Aluno reprovado.");
    }
    if(a>=5 && a<=6.9){
      System.out.println("Aluno em exame.");
      float s=rbt.nextFloat();
      System.out.printf("Nota do exame: %.1f\n", s);
      float a2=(a+s)/2;
      if(a>=5){
        System.out.println("Aluno aprovado.");
      }
      if(a<=4.9){
        System.out.println("Aluno reprovado.");
      }
      System.out.printf("Media final: %.1f\n", a2);
    }
  }
}