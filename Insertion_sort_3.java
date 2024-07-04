import java.util.*;
public class Insertion_sort_3{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=Sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
            arr[i]=Sc.nextInt();
        System.out.println("Entered Array is:");
        print(arr);
        //process
        for(int round=0;round<n-1;round++){
            for(int i=round;i>=0&&arr[i]>arr[i+1];i--){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
            }
        }
        System.out.println("Sorted Array is:");
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
    }
}
