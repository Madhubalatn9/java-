import java.util.Scanner;
class pal_str{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s=scan.nextLine();
        boolean isPal=true;
        int left=0, right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                isPal=false;
            }
            left++;
            right--;
        }
        if(isPal){
            System.out.println(" Palindrome");
        }else{
        System.out.println(" Not Palindrome");
    }
    }
}