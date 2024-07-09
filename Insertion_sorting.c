#include<stdio.h>
void main(){
    int arr[]={1,6,3,2,4,5,1,2,23,63,2,23};
    int n=12;
    printf("Entered Array is:\n");
    for(int i=0;i<n;i++)
        printf("%d ",arr[i]);
    //process
    for(int round=0;round<n;round++){
        for(int i=round-1;i>=0 && arr[i]>arr[i+1];i--){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    printf("\nSorted Array is:\n");
    for(int i=0;i<n;i++)
        printf("%d ",arr[i]);    
}