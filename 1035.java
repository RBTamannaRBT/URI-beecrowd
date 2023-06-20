import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int a=rbt.nextInt();
    int b=rbt.nextInt();
    int c=rbt.nextInt();
    int d=rbt.nextInt();
    if((b>c && d>a) && ((c+d)>(a+b) && c>=0 && d>=0) && a%2==0){
    System.out.println( "Valores aceitos");
    }
    else{
    System.out.println("Valores nao aceitos");
    }
    }
}