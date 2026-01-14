import java.util.*;

class Duplicates{
    public boolean repeat(int[] arr){
        HashSet<Integer> seenNum=new HashSet<>();

        for(int num:arr){
            if(seenNum.contains(num)){
                return true;
            }
            seenNum.add(num);
    }
       return false;
    }
   public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=scan.nextInt();
        int[] num=new int[n];
        System.out.println("Enter the "+n+" elements");
        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
        }
        Duplicates obj=new Duplicates();
        boolean res=obj.repeat(num);
        if(res==true){
            System.out.println("Duplicates Found");
        }
        else{
            System.out.println("No Duplicates");
        }

    }
   }
