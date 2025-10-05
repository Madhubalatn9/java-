import java.util.Scanner;
class LargestEle{
    public static int largest(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=scan.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter " + size+ " elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        int result = largest(arr);
        System.out.println("Largest element: " + result);

    }
}