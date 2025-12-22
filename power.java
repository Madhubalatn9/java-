import java.util.Scanner;

class power{
    public double pow(double b,int e){
        if(e<0){
            b=1/b;
            e=-e;
        }
        double res=1.0;

        while(e>0){
            if(e%2!=0){
                res*=b;
            }
            b*=b;
            e/=2;
        }
        return res;
    }
    public static void main(String args[]){
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the base value:");
       double base=scan.nextDouble();
       System.out.println("Enter the power value:");
       int exp=scan.nextInt();

       power p1=new power();
       double result=p1.pow(base,exp);
    
      System.out.println("Result:"+result);
    }
}