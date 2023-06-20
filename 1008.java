import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int employeeNumber=rbt.nextInt();
    int workedHours=rbt.nextInt();
    float amount=rbt.nextFloat();
    float salary=amount*workedHours;
    System.out.println("NUMBER = "+employeeNumber);
    System.out.printf("SALARY = U$ %.2f\n",salary);
  }
}