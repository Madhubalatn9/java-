import java.util.Scanner;
class ProductArray{
    public int[] product(int[] arr){
        int[] res=new int[arr.length];

        int pre=1,post=1;
        for(int i=0;i<arr.length;i++){
            res[i]=pre;
            pre=arr[i]*pre;
        }
        for(int i=arr.length-1;i>=0;i--){
            res[i]=res[i]*post;
            post=arr[i]*post;
        }
        return res;
    }
   

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number of Input Array:");
        int n=scan.nextInt();
        System.out.println("Enter the Input Array:");
        int[] num =new int[n];
        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
        }
        ProductArray obj=new ProductArray();
        int[] res=obj.product(num);

        System.out.println("Product Array Except Self:");
        for (int val : res){
            System.out.print(val + " ");
        }
    }
}
    

    
