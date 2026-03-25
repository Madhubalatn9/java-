import java.util.ArrayList;
import java.util.*;

public class Remove_duplicates{
    ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();

        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                res.add(arr[i]);
                i=j;
            }
        }
        res.add(arr[i]);
        return res;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=scan.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Remove_duplicates rd=new Remove_duplicates();
        ArrayList<Integer> result=rd.removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        for(int num:result){
            System.out.print(num+" ");
        }
        

    }
}
