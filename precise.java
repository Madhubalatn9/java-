import java.util.Scanner;
class precise{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the A value:");
        float A=scan.nextFloat();
        System.out.println("enter the B value:");
        float B=scan.nextFloat();

        float exact=A/B;
        float format=Float.parseFloat(String.format("%.3f",exact));

        System.out.println("Exact Result is: " +exact+ "  , Precise Format(3 decimal): " +format);

        
    }
}