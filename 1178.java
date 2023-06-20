import java.util.Scanner;
public class Main{
  public static void main(String[]args){
  Scanner rbt=new Scanner(System.in);
  double []n=new double[100];
  double x=rbt.nextDouble();
  for(int i=0; i<n.length; i++){
  n[i]=x;
  x/=2;
  }
  for(int i=0; i<n.length; i++){
  System.out.printf("N["+i+"] = %.4f\n",n[i]);
  }
  }
}