import java.util.Scanner;
public class Main{
  public static void main(String[]args){
  Scanner rbt=new Scanner(System.in);
  int n=rbt.nextInt();
  int in=0, out=0;
  for(int i=1; i<=n; i++){
  int x=rbt.nextInt();
  if(x>=10 && x<=20){
  in++;
  }
  else{
  out++;
  }
  }
  System.out.println(in+" in");
  System.out.println(out+" out");
  }
}