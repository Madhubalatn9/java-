import java.util.Scanner;

class LastWordLength{
    public static void main(String args[]){
       System.out.println("Enter your String:");
       Scanner scan=new Scanner(System.in);
       String s=scan.nextLine();

       int i=s.length()-1;
       int count =0;

       while(i>=0 && s.charAt(i)==' '){
        i--;
       }
       while(i>=0 && s.charAt(i)!=' '){
        count++;
        i--;
       }
       System.out.println("Length of Last Word is:"+count);
    }
}