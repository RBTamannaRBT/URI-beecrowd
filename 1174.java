import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    double []a=new double[100];
    for(int i=0; i<a.length; i++){
      a[i]=rbt.nextDouble();
    }
    for(int i=0; i<a.length; i++){
      if(a[i]<=10){
        System.out.println("A["+i+"]"+" = "+a[i]);
      }
    }
  }
}