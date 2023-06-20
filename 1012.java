import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner rbt=new Scanner(System.in);
        double pi=3.14159;
        double a=rbt.nextDouble();
        double b=rbt.nextDouble();
        double c=rbt.nextDouble();
        System.out.printf("TRIANGULO: %.3f\n", (1.0/2.0)*a*c);
        System.out.printf("CIRCULO: %.3f\n", pi*c*c);
        System.out.printf("TRAPEZIO: %.3f\n", (1.0/2.0)*(a+b)*c);
        System.out.printf("QUADRADO: %.3f\n", b*b);
        System.out.printf("RETANGULO: %.3f\n", a*b);
    }
}