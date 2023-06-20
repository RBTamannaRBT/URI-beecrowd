import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int e=0, o=0, p=0, n=0;
    for(int i=1; i<=5; i++){
      int a=rbt.nextInt();
      if(a%2==0){
        e++;
      }
      if(a%2!=0){
        o++;
      }
      if(a>0){
        p++;
      }
      if(a<0){
        n++;
      }
    }
    System.out.println(e+" valor(es) par(es)");
    System.out.println(o+" valor(es) impar(es)");
    System.out.println(p+" valor(es) positivo(s)");
    System.out.println(n+" valor(es) negativo(s)");
  }
}
