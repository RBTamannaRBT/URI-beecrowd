import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int t = rbt.nextInt();
    for(int i = 1; i<=t; i++){
      int pa = rbt.nextInt();
      int pb = rbt.nextInt();
      double ga = rbt.nextDouble();
      double gb = rbt.nextDouble();
      int y = 0;
      while(pa<=pb){
        pa+=(int)((ga*pa)/100);
        pb+=(int)((gb*pb)/100);
        y++;
        if(y>100){
          break;
        }
      }
      if(y>100){
        System.out.println("Mais de 1 seculo.");
      }else{
        System.out.println(y+" anos.");
      }
    }
  }
}