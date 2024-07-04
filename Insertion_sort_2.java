import java.util.*;
public class Insertion_sort_2{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=Sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
            arr[i]=Sc.nextInt();

        System.out.println("Entered Array is: ");
        print(arr);

        for(int round=0;round<n-1;round++){
            int i=round;
            while(i>=0 && arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i--;
            }
        }
        System.out.println("Sorted Array: ");
        print(arr);
    }
    static void print(int[] arr){
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
    }
}
