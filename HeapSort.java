package com.example.myapplication;

// sample code for Heap Sort algorithm

public class HeapSort {

    public void buildHeap(int arr[], int n, int i)
    {
        int largest=i;
        int left=2*i+1;
        int right =2*i+2;

        if(left<n && arr[left]>arr[largest])
            largest=left;
        if(right<n && arr[right]>arr[largest])
            largest=right;

        if (largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            buildHeap(arr, n, largest);

        }

    }
    public void sort(int arr[])
    {
        int n=arr.length;

        for(int i=n/2 -1; i >= 0; i--)
        buildHeap(arr, n, i);

        for(int i=n-1;i>=0; i--)
        {
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            buildHeap(arr, i, 0);
        }


    }

    public static void main(String[]args)
    {
        int arr[]={4, 78, 65, 56, 34, 50, 98, 89};
        int n=arr.length;

        HeapSort obj=new HeapSort();
        obj.sort(arr);
        System.out.println("The sorted array is: ");
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }


}
