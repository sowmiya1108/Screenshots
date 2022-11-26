package oops;

public class Bubblesort {
    public static void main(String[] args){
        int[] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

        System.out.println("Before Sorting: ");
        for(int elt:arr){
            System.out.println(elt+ " ");
        }
        System.out.println();
        bubbleSort(arr);

        System.out.println("After Sorting: ");
        for(int elt:arr){
            System.out.println(elt+ " ");
        }
    }
    public static void bubbleSort(int[] arr){
        int len=arr.length;
        int temp=0;

        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
