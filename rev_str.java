import java.util.Scanner;

class rev_str{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String:"); //get input str
        String s=scan.nextLine();

        int left=0 ,right=s.length()-1;
        char[] arr=s.toCharArray(); 

        while(left<right){
            char temp=arr[left];  
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String str_arr=new String(arr); //convert char arr to string
        System.out.println("Reverse the String are:"+str_arr); //print rev str
    }
}