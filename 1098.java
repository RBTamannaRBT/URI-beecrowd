public class Main{
    public static void main(String[]args){
      for(double i=0; i<=2; i=i+0.2){
        double j=1+i;
        for(int k=1; k<=3; k++){
          if(i==0 || i==1 || (i>1.9 && i<2.1)){
            System.out.printf("I=%.0f J=%.0f\n",i,j);
          }
          else{
            System.out.printf("I=%.1f J=%.1f\n",i,j);
          }
          j++;
        }
      }
    }
  }