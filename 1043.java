import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    float a=rbt.nextFloat();
    float b=rbt.nextFloat();
    float c=rbt.nextFloat();
    if(a<(b+c) && b<(a+c) && c<(a+b)){
      System.out.printf("Perimetro = %.1f\n", a+b+c);
    }
    else{
      System.out.printf("Area = %.1f\n", ((a+b)*c)/2);
    }
  }
}