import java.util.*;
class TwoSum{
    public int[] twosum(int[] arr,int target){
    HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
        
        if(map.containsKey(complement)){
            return new int[]{
                map.get(complement),i
            };
        }
        map.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the  of number:");
        int n=scan.nextInt();

        int[] num=new int[n];
        System.out.println("Enter the element:");
        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
        }
        System.out.println("Enter target:");
        int target=scan.nextInt();

        TwoSum obj=new TwoSum();
        int[] res=obj.twosum(num,target);

        if(res.length==0){
            System.out.println("No Pair Found");
        }
        else{
            System.out.println("Indices:"+res[0]+","+res[1]);
        }


    }
}
