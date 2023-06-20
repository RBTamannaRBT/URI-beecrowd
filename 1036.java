import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner rbt=new Scanner(System.in);
        double A=rbt.nextDouble();
        double B=rbt.nextDouble();
        double C=rbt.nextDouble();
        if ((A == 0) || (((B*B) -(4*A*C)) < 0)){
            System.out.println("Impossivel calcular");
        }
        else{
            double   R1 = (((-1*B) + Math.sqrt(((B*B) -(4*A*C)))) / (2*A));
            double   R2 =(((-1*B) - Math.sqrt(((B*B) -(4*A*C)))) / (2*A));
            System.out.printf("R1 = %.5f\n", R1);     
            System.out.printf("R2 = %.5f\n", R2);
            
        }
    }
}